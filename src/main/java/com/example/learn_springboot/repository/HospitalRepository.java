package com.example.learn_springboot.repository;

import com.example.learn_springboot.model.HospitalBean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<HospitalBean, Long>{
    
}