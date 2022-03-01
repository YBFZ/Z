package com.z.Dao;

import com.z.Pojo.Classify;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ClassifyDao {
//    模拟数据库中的数据
    private static Map<Integer, Classify> classify = null;
    static {
//    创建一个垃圾类表
        classify = new HashMap<Integer,Classify>();

        classify.put(01,new Classify(01,"有害垃圾"));
        classify.put(02,new Classify(02,"厨余垃圾"));
        classify.put(03,new Classify(03,"干垃圾"));
        classify.put(04,new Classify(04,"湿垃圾"));
        classify.put(05,new Classify(05,"可回收物"));
    }

//    获得所有垃圾类的信息
    public Collection<Classify> getClassify() {
        return classify.values();
    }
//    通过id得到垃圾类
    public Classify getClassify(Integer id) {
        return classify.get(id);
    }


}
