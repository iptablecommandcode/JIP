package com.example.learn_springboot.service;

import java.util.Map;

import com.example.learn_springboot.dao.MemberDao;
import com.example.learn_springboot.repository.MemberRepository;

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
    public Object saveObject(Map<String, Object> dataMap){
        String sqlMapId = "ACCOUNT.ADD";
        Object resultObject = dao.saveObject(sqlMapId, dataMap);
        return resultObject;
    }
}