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
        Map<String, Object> idMap = new HashMap<String, Object>();//ID check
        String viewName = "/sign/";

        if (paramMap.get("flag") == null){// check sign in
            flagMap.put("flag", false);//without Sign in
        } else {
            flagMap.put("flag", paramMap.get("flag"));
        }

        if("SignIn".equals(action)){//SignIn page
            resultMap.put("SignIn", "<a class='nav-link' href='../sign/SignIn' th:href='@{/sign/SignIn}'>Sign In <span class='sr-only'></span></a>");//SignIn/Up Button
            resultMap.put("SignUp", "<a class='nav-link' href='../sign/SignUp' th:href='@{/sign/SignUp}'>Sign Up</a>");
            resultMap.put("SignOut", "");
            viewName += action;
        } else if("SignUp".equals(action)){//SignUp page
            resultMap.put("SignIn", "<a class='nav-link' href='../sign/SignIn' th:href='@{/sign/SignIn}'>Sign In <span class='sr-only'></span></a>");//SignIn/Up Button
            resultMap.put("SignUp", "<a class='nav-link' href='../sign/SignUp' th:href='@{/sign/SignUp}'>Sign Up</a>");
            resultMap.put("SignOut", "");
            viewName += action;
        } else if("SignOut".equals(action)){
            flagMap.put("flag", null);
            idMap.put("ID", "");
            resultMap.put("SignIn", "<a class='nav-link' href='../sign/SignIn' th:href='@{/sign/SignIn}'>Sign In <span class='sr-only'></span></a>");//SignIn/Up Button
            resultMap.put("SignUp", "<a class='nav-link' href='../sign/SignUp' th:href='@{/sign/SignUp}'>Sign Up</a>");
            resultMap.put("SignOut", "");
            viewName = "index";
        }

        modelAndView.setViewName(viewName);
        modelAndView.addObject("flag", flagMap);
        modelAndView.addObject("resultMap", resultMap);
        modelAndView.addObject("idChk", idMap);
        return modelAndView;
    }
}