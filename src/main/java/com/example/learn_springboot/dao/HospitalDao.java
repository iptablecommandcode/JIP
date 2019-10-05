package com.example.learn_springboot.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HospitalDao{
    @Autowired
    private SqlSessionTemplate sqlSession;
    public Object getList(String sqlMapId){
        Object resultObject = sqlSession.selectList(sqlMapId);

        return resultObject;
    }
}