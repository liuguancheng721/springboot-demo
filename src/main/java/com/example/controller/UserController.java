package com.example.controller;

import com.example.bean.User;
import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/selectAllUser")
    @ResponseBody
    public List<User> selectAllUser() {
        List<User> users = userService.selectAllUser();
        return users;
    }

}
