package com.kdeb.ticketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kdeb.ticketing.model.SoftwareEngineer;

@Repository
public interface SoftwareEngineerRepository extends JpaRepository<SoftwareEngineer, Integer>{
    
}