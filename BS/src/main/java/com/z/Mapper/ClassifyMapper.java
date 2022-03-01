package com.z.Mapper;

import com.z.Pojo.Classify;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ClassifyMapper {
    List<Classify> queryClassifyList();
    Classify queryClassifyById(int id);

}

