package com.example.banksoft.controller;

import com.example.banksoft.common.Result;
import com.example.banksoft.entity.User;
import com.example.banksoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result<String> login(String username,String password){
        User loginUser=userService.findByUsername(username);

        if(loginUser==null){
            return Result.error("用户名不存在");
        }

        if(password.equals(loginUser.getPassword())){
           return Result.success("登录成功");
        }
        return Result.error("密码错误");
    }
}
