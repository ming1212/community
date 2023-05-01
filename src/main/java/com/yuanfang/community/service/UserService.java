package com.yuanfang.community.service;

import com.yuanfang.community.mapper.UserMapper;
import com.yuanfang.community.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(int id){
        return userMapper.getUserById(id);
    }
}
