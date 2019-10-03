package com.example.learn_springboot.repository;

import com.example.learn_springboot.util.MemberBean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberBean, Long>{
    
}