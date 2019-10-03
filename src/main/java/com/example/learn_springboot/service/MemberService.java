package com.example.learn_springboot.service;

import com.example.learn_springboot.repository.MemberRepository;
import com.example.learn_springboot.util.MemberDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService{
    @Autowired
    private MemberRepository repository;

    @Autowired
    private MemberDao dao;

    public Object getMember(Object dataMap){
        String sqlMapId = "ACCOUNT.ID";
        Object resultObject = dao.getObject(sqlMapId, dataMap);
        return resultObject;
    }
}