package com.example.learn_springboot.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SignController{

    @RequestMapping(value = {"/sign/SignIn"})
    public void actionMethod(@RequestParam Map<String, Object> paramMap, ModelAndView modelAndView){
        String viewName = "/sign/SignIn";
    }
}