package com.example.test2018131382.controller;

import com.example.test2018131382.bean.UserBean;
import com.example.test2018131382.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Resource
    UserService userService;

    @RequestMapping("/login")
    public String show() {
        return "login";
    }

    @RequestMapping(value = "/loginln", method = RequestMethod.POST)
    public String login(String name, String password) {
        UserBean userBean = userService.loginln(name, password);
        if (userBean != null) {
            return "success";
        } else {
            return "error";
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "index";
    }
}