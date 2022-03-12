package com.wells.mall.controller;

import com.wells.mall.model.pojo.User;
import com.wells.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @ResponseBody
    @GetMapping("/test")
    public User personalPage(){
        return userService.getUser()  ;
    }
}
