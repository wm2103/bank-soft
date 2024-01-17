package com.example.banksoft.service;

import com.example.banksoft.entity.User;
import com.example.banksoft.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;


    public User findByUsername(String username) {
        User u=userMapper.selectByUsername(username);
        return u;
    }
}
