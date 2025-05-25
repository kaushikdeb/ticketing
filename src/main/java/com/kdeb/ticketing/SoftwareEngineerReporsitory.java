package com.kdeb.ticketing;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftwareEngineerReporsitory extends JpaRepository<SoftwareEngineer, Integer>{
    
}