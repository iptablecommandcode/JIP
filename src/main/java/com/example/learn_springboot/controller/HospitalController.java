package com.example.learn_springboot.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.learn_springboot.service.HospitalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HospitalController{
    @Autowired
    private HospitalService service;

    @RequestMapping(value = "/hospital/{action}", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action, ModelAndView modelAndView) {

        Map<String, Object> resultMap = new HashMap<String, Object>();
        Map<String, Object> flagMap = new HashMap<String, Object>();
        Map<String, Object> idMap = new HashMap<String, Object>();

        String viewName = "/hospital/";

        if (paramMap.get("flag") != null) {//Sign IN status
            resultMap.put("SignIn", "");// SignIn/Up            
			resultMap.put("SignUp", "");
			resultMap.put("SignOut", "<a class='nav-link' href='../sign/SignOut' th:href='@{/sign/SignOut}'>Sign Out</a>");
		    if (paramMap.get("ID") == null)
                idMap.put("ID", "");
		    else {
                flagMap.put("flag", paramMap.get("flag"));
		        idMap.put("ID", paramMap.get("ID"));
            }
        } else {
            flagMap.put("flag", false);
            idMap.put("ID", null);
            resultMap.put("SignIn", "<a class='nav-link' href='../sign/SignIn' th:href='@{/sign/SignIn}'>Sign In <span class='sr-only'></span></a>");//SignIn/Up Button
            resultMap.put("SignUp", "<a class='nav-link' href='../sign/SignUp' th:href='@{/sign/SignUp}'>Sign Up</a>");
            resultMap.put("SignOut", "");
            
            viewName = "index";
        }

        if("info".equals(action)){
            viewName += "info";
        }

        modelAndView.setViewName(viewName);
        modelAndView.addObject("paramMap", paramMap);
		modelAndView.addObject("resultMap", resultMap);
		modelAndView.addObject("flag", flagMap);
		modelAndView.addObject("idChk", idMap);
        return modelAndView;
    }
}