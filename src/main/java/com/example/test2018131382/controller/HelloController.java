package com.example.test2018131382.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller

public class HelloController {

    @RequestMapping(value = "index")
    public String index(){return "index";}
}