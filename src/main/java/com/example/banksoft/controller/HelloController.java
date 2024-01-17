package com.example.banksoft.controller;

import com.example.banksoft.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public Result<String> hello(){
        return Result.success("hello");
    }

}
