package com.z.Controller;

import com.z.Mapper.ClassifyMapper;
import com.z.Pojo.Classify;
import com.z.Pojo.Rubbish;
import com.z.Service.RubbishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Collection;
import java.util.List;

@Controller
public class RubbishController {

    @Autowired
    private RubbishService rubbishService;
    @Autowired
    private ClassifyMapper classifyMapper;

    @RequestMapping("/rub")
    public String list(Model model) {
        List<Rubbish> rubbishList =rubbishService.queryRubbishList();
        model.addAttribute("rubs", rubbishList);
        return "rubbish/list";
    }

    @GetMapping("addrub")
    public String toAddPage(Model model) {
//        查出所有类别信息
        Collection<Classify> classifies = classifyMapper.queryClassifyList();
        model.addAttribute("cls", classifies);
        return "rubbish/add";
    }

    @PostMapping("addrub")
    public String AddPage(Rubbish rubbish) {
        rubbishService.addRubbish(rubbish);
        return "redirect:/rub";
    }

//    去到垃圾的修改页面
    @GetMapping("/rub/{id}")
    public String toUpdateRub(Model model) {
//        查出原来的数据
        List<Rubbish> rubbishList = rubbishService.queryRubbishList();
        model.addAttribute("rub",rubbishList);
//       查出类别信息
        Collection<Classify> classifies = classifyMapper.queryClassifyList();
        model.addAttribute("cls", classifies);
        return "rubbish/update";
    }

    @PostMapping("/updateRub")
    public String updateRub(Rubbish rubbish){
        rubbishService.updateRubbish(rubbish);
        return "redirect:/rub";
    }

//    删除
    @GetMapping("/delRub/{id}")
    public String deleteRub(@PathVariable("id")int id) {
        rubbishService.deleteRubbish(id);
        return "redirect:/rub";

    }

}
