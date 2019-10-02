package com.example.learn_springboot.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyPageController{
    @RequestMapping(value = {"/mypage/MyPage"}, method = RequestMethod.POST)
    public ModelAndView actioinMethod(@RequestParam Map<String,Object> paramMap, ModelAndView modelAndView){
        
        return modelAndView;
    }
}