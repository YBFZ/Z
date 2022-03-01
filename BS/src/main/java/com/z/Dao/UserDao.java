package com.z.Dao;

import com.z.Pojo.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDao {
//    模拟数据库数据
    private static Map<Integer, User> user = null;
    static {
//        创建一个用户表
        user = new HashMap<Integer, User>();
//        向表中填写数据
        user.put(01,new User(01,"张三"));
        user.put(02,new User(02,"李四"));
        user.put(03,new User(03,"王五"));
    }
//    获得所有用户信息
    public Collection<User> getAll() {
        return user.values();
    }
//    通过id得到用户
    public User getUserById(Integer id) {
        return user.get(id);
    }
}
