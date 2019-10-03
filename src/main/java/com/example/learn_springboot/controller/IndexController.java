package com.example.learn_springboot.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.learn_springboot.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class IndexController {
	@Autowired
	private MemberService service;

	@RequestMapping(value = "/{action}", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelAndView) {

				Map<String, Object> resultMap = new HashMap<String, Object>();
				Object resultDB;
				String idChk,pwChk,DBID = "",DBPW = "";
        		Object resultList = new Object();
				Map<String, Object> flagMap = new HashMap<String, Object>();//login check
				Map<String, Object> idMap = new HashMap<String, Object>();//ID check
        		String viewName = action;

				if("index".equals(action)){
					if (paramMap.get("flag") == null){
						flagMap.put("flag", false);
						if (paramMap.get("ID") == null)
            				idMap.put("ID", "");
        				else
            				idMap.put("ID", paramMap.get("ID"));
					} else {
						//로그인 디비 체크
						resultDB = service.getMember(paramMap);
						resultMap = (Map<String, Object>) resultDB;

						idChk = (String) paramMap.get("ID");
						pwChk = (String) paramMap.get("PWD");

						if(resultMap != null){//디비정보 아이디
							if (resultMap.get("ID") == null) {
								DBID = "";
							} else {
								DBID = (String) resultMap.get("ID");
							}

							if (resultMap.get("PWD") == null) {
								DBPW = "";
							} else {
								DBPW = (String) resultMap.get("PWD");
							}
						}

						if(DBID.equals(idChk) && DBPW.equals(pwChk)){//아이디 비밀번호 체크
							flagMap.put("flag", true);
							idMap.put("ID", paramMap.get("ID"));
						} else {
						//로그인 실패시
						flagMap.put("flag", false);
						viewName = "sign/SignIn";
						}
					}
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
