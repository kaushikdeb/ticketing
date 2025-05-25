package com.kdeb.ticketing.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.kdeb.ticketing.model.SoftwareEngineer;
import com.kdeb.ticketing.model.SoftwareEngineerDTO;
import com.kdeb.ticketing.repository.SoftwareEngineerRepository;

@Service
public class SoftwareEngineerService {
 
    private final SoftwareEngineerRepository softwareEngineerReporsitory;

    SoftwareEngineerService(SoftwareEngineerRepository sER){
        this.softwareEngineerReporsitory = sER;
    }

    public List<SoftwareEngineerDTO> getAllSWEngineers(){
        return softwareEngineerReporsitory.findAll()
        .stream()
        .map(softwareEngineer -> new SoftwareEngineerDTO(
            softwareEngineer.getName(),
            softwareEngineer.getTechStack()
        ))
        .collect(Collectors.toList());
    }

    public void addEngineer(SoftwareEngineer softwareEngineer) {
        softwareEngineerReporsitory.save(softwareEngineer);
    }

    public SoftwareEngineerDTO getSWEnggById(Integer id) {
        SoftwareEngineer swe = softwareEngineerReporsitory.findById(id)
        .orElseThrow();

        return new SoftwareEngineerDTO(
            swe.getName(),
            swe.getTechStack()
        );
    }
}
