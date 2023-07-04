package com.example.demo.repository;

import com.example.demo.model.emgperson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface emgpersonRepository extends JpaRepository<emgperson,Long >{
    //all crud db methods
}

