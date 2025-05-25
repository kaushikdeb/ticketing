package com.kdeb.ticketing;

import java.util.List;

import org.springframework.stereotype.Service;

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
