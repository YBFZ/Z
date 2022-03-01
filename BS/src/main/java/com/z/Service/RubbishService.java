package com.z.Service;

import com.z.Pojo.Rubbish;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RubbishService {
    List<Rubbish> queryRubbishList();
    Rubbish queryRubbishById(int id);
    void addRubbish(Rubbish rubbish);
    void updateRubbish(Rubbish rubbish);
    void deleteRubbish(int id);

}
