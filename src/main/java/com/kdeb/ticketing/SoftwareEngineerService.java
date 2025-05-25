package com.kdeb.ticketing;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SoftwareEngineerService {
 
    private final SoftwareEngineerReporsitory softwareEngineerReporsitory;

    SoftwareEngineerService(SoftwareEngineerReporsitory sER){
        this.softwareEngineerReporsitory = sER;
    }

    public List<SoftwareEngineer> getAllSWEngineers(){
        return softwareEngineerReporsitory.findAll();
    }
}
