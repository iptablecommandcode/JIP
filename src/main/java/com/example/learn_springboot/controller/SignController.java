package com.example.learn_springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignController {

    @RequestMapping(value = "/sign/{action}", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelAndView) {

        Map<String, Object> resultMap = new HashMap<String, Object>();
        Object resultList = new Object();
        Map<String, Object> flagMap = new HashMap<String, Object>();
        String viewName = "/sign/SignIn";

        if (paramMap.get("flag") == null){// check sign in
            flagMap.put("flag", false);
        } else {
            flagMap.put("flag", paramMap.get("flag"));
        }


        modelAndView.setViewName(viewName);
        modelAndView.addObject("flag", flagMap);
        return modelAndView;
    }
}