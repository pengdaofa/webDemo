package com.pengdf.web.demo.controller.user;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pengdf.web.demo.service.user.IUserService;
import com.pengdf.web.demo.user.user.UserVO;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
    public String login() {
        UserVO user = new UserVO();
        user.setUserId(UUID.randomUUID().toString());
        user.setUserName("test1");
        user.setPassword("123456");

        try {
            userService.addUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "user/login";
    }
}