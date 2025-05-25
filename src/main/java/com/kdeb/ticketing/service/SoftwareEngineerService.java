package com.kdeb.ticketing.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kdeb.ticketing.model.SoftwareEngineer;
import com.kdeb.ticketing.repository.SoftwareEngineerRepository;

@Service
public class SoftwareEngineerService {
 
    private final SoftwareEngineerRepository softwareEngineerReporsitory;

    SoftwareEngineerService(SoftwareEngineerRepository sER){
        this.softwareEngineerReporsitory = sER;
    }

    public List<SoftwareEngineer> getAllSWEngineers(){
        return softwareEngineerReporsitory.findAll();
    }

    public void addEngineer(SoftwareEngineer softwareEngineer) {
        softwareEngineerReporsitory.save(softwareEngineer);
    }

    public SoftwareEngineer getSWEnggById(Integer id) {
        return softwareEngineerReporsitory.findById(id)
        .orElseThrow();
    }
}
