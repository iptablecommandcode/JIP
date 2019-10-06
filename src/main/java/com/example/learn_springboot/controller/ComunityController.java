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
public class ComunityController{

    @RequestMapping(value = "/comunity/{action}", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelAndView) {
                Map<String, Object> resultMap = new HashMap<String, Object>();
        		Object resultList = new Object();
				Map<String, Object> flagMap = new HashMap<String, Object>();//login check
				Map<String, Object> idMap = new HashMap<String, Object>();//ID check
                String viewName = "/comunity/";

                if(paramMap.get("flag") == null){//Not Sign In
                    flagMap.put("flag", false);
                    if(paramMap.get("ID") == null){
                        idMap.put("ID", "");
                    } else {
                        idMap.put("ID", paramMap.get("ID"));
                    }
                    resultMap.put("SignIn", "<a class='nav-link' href='../sign/SignIn' th:href='@{/sign/SignIn}'>Sign In <span class='sr-only'></span></a>");//SignIn/Up Button
					resultMap.put("SignUp", "<a class='nav-link' href='../sign/SignUp' th:href='@{/sign/SignUp}'>Sign Up</a>");
					resultMap.put("SignOut", "");
                } else {
                    flagMap.put("flag", paramMap.get("flag"));//Sign In
                    idMap.put("ID", paramMap.get("ID"));
                    resultMap.put("SignOut", "<a class='nav-link' href='../sign/SignOut' th:href='@{/sign/SignOut}'>Sign Out</a>");//sign Out button
					resultMap.put("SignUp","");
					resultMap.put("SignIn", "");
                }
                if("comunity".equals(action)){
                    viewName += "comunity";
                }

                modelAndView.setViewName(viewName);
                modelAndView.addObject("paramMap", paramMap);
                modelAndView.addObject("resultMap", resultMap);
                modelAndView.addObject("flag", flagMap);
                modelAndView.addObject("idChk", idMap);
                modelAndView.addObject("resultList", resultList);
                return modelAndView;
    }
}