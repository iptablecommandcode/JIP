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
public class AreaController {

    @RequestMapping(value = "/area/{action}", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action, ModelAndView modelAndView) {

        Map<String, Object> resultMap = new HashMap<String, Object>();
        Map<String, Object> flagMap = new HashMap<String, Object>();
        Map<String, Object> idMap = new HashMap<String, Object>();
        String viewName = "/area/";

	    if (paramMap.get("flag") != null) {//status signin
            resultMap.put("SignIn", "");// SignIn/Up            
			resultMap.put("SignUp", "");
			resultMap.put("SignOut", "<a class='nav-link' href='../sign/SignOut' th:href='@{/sign/SignOut}'>Sign Out</a>");
		    if (paramMap.get("ID") == null)
                idMap.put("ID", "");
		    else {
                flagMap.put("flag", paramMap.get("flag"));
		        idMap.put("ID", paramMap.get("ID"));
            }
        } else {//status sign out
            flagMap.put("flag", false);
            idMap.put("ID", null);
            resultMap.put("SignIn", "<a class='nav-link' href='../sign/SignIn' th:href='@{/sign/SignIn}'>Sign In <span class='sr-only'></span></a>");//SignIn/Up Button
            resultMap.put("SignUp", "<a class='nav-link' href='../sign/SignUp' th:href='@{/sign/SignUp}'>Sign Up</a>");
            resultMap.put("SignOut", "");
            resultMap.put("Nickname1", "로그인해 주십시오");// title
			resultMap.put("Rank1", "");
            resultMap.put("Mileage1", "");
            
			resultMap.put("NICKNAME", "");// main
			resultMap.put("RANK", "");
			resultMap.put("MILEAGE", "");
            viewName = "index";
        }
        if("City".equals(action)){//area page
            if(paramMap.get("ID").equals(null)){
                viewName = "index";
            }
            viewName += "City";
        } else if("Office".equals(action)){

            viewName += "Office";
        }

        modelAndView.setViewName(viewName);//return data
        modelAndView.addObject("resultMap", resultMap);
        modelAndView.addObject("paramMap", paramMap);
        modelAndView.addObject("flag", flagMap);
        modelAndView.addObject("idChk", idMap);
        return modelAndView;
    }
}