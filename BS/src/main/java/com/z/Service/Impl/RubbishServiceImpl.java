package com.z.Service.Impl;

import com.z.Mapper.RubbishMapper;
import com.z.Pojo.Rubbish;
import com.z.Service.RubbishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RubbishServiceImpl implements RubbishService {
    @Autowired
    private RubbishMapper rubbishMapper;
    @Override
    public List<Rubbish> queryRubbishList(){
        return rubbishMapper.queryRubbishList();
    }

    @Override
    public Rubbish queryRubbishById(int id) {
       return rubbishMapper.queryRubbishById(id);
    }

    @Override
    public void addRubbish(Rubbish rubbish) {
        rubbishMapper.addRubbish(rubbish);
    }

    @Override
    public void updateRubbish(Rubbish rubbish) {
       rubbishMapper.updateRubbish(rubbish);
    }

    @Override
    public void deleteRubbish(int id) {
       rubbishMapper.deleteRubbish(id);
    }

}
