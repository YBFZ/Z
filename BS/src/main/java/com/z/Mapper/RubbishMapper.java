package com.z.Mapper;

import com.z.Pojo.Rubbish;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RubbishMapper {
    List<Rubbish> queryRubbishList();
    Rubbish queryRubbishById(int id);
    void  addRubbish(Rubbish rubbish);
    void updateRubbish(Rubbish rubbish);
    void deleteRubbish(int id);
}
