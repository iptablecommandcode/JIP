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
        				else{
							idMap.put("ID", paramMap.get("ID"));
						}
						resultMap.put("SignIn", "<a class='nav-link' href='../sign/SignIn' th:href='@{/sign/SignIn}'>Sign In <span class='sr-only'></span></a>");//SignIn/Up Button
						resultMap.put("SignUp", "<a class='nav-link' href='../sign/SignUp' th:href='@{/sign/SignUp}'>Sign Up</a>");
						resultMap.put("SignOut", "");

						resultMap.put("Nickname1","로그인해 주십시오");//pet title
						resultMap.put("Rank1","");
						resultMap.put("Mileage1","");

						resultMap.put("NICKNAME","");//main
						resultMap.put("RANK","");
						resultMap.put("MILEAGE","");
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

						if(DBID.equals(idChk) && DBPW.equals(pwChk)){//ID PW CHK
							resultMap.put("Nickname1","<h3>닉네임</h3>");//title
							resultMap.put("Rank1","<h3>등급</h3>");
							resultMap.put("Mileage1","<h3>마일리지</h3>");

							resultMap.put("SignOut", "<a class='nav-link' href='../sign/SignOut' th:href='@{/sign/SignOut}'>Sign Out</a>");//sign Out button
							resultMap.put("SignUp","");
							resultMap.put("SignIn", "");
							flagMap.put("flag", true);
							idMap.put("ID", paramMap.get("ID"));
						} else {
						//로그인 실패시
						flagMap.put("flag", false);
						idMap.put("ID", "");
						resultMap.put("Nickname1","로그인해 주십시오");//title
						resultMap.put("Rank1","");
						resultMap.put("Mileage1","");

						resultMap.put("NICKNAME","");//main
						resultMap.put("RANK","");
						resultMap.put("MILEAGE","");
						resultMap.put("SignIn", "<a class='nav-link' href='../sign/SignIn' th:href='@{/sign/SignIn}'>Sign In</a>");//SignIn/Up Button
						resultMap.put("SignUp", "<a class='nav-link' href='../sign/SignUp' th:href='@{/sign/SignUp}'>Sign Up</a>");
						resultMap.put("SignOut", "");
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
