package com.hctym.springmybatis.service;

import com.hctym.springmybatis.mapper.UserMapper;
import com.hctym.springmybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryUserById(int id){
        return userMapper.selectByPrimaryKey(id);
    }


    public int addUser(User user){
        return userMapper.insert(user);
    }

}
