package com.example.learn_springboot.service;

import com.example.learn_springboot.dao.HospitalDao;
import com.example.learn_springboot.repository.HospitalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalService{
    @Autowired
    private HospitalRepository repository;

    @Autowired
    private HospitalDao dao;
    
    public Object getInfo(){
        String sqlMapId = "HOSPITAL.INFO";
        Object resultObject = dao.getList(sqlMapId);
        return resultObject;
    }
}