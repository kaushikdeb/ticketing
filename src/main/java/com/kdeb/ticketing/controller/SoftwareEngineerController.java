package com.kdeb.ticketing.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kdeb.ticketing.model.SoftwareEngineer;
import com.kdeb.ticketing.model.SoftwareEngineerDTO;
import com.kdeb.ticketing.service.SoftwareEngineerService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;

    SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }
    
    @GetMapping()
    public List<SoftwareEngineerDTO> getEngineers(){
        return softwareEngineerService.getAllSWEngineers();
    }
    
    @GetMapping("{id}")
    public SoftwareEngineerDTO getEngineerById(@PathVariable Integer id){
        return softwareEngineerService.getSWEnggById(id);
    }

    @PostMapping("add")
    public void addEngineer(@RequestBody SoftwareEngineer softwareEngineer) {        
        softwareEngineerService.addEngineer(softwareEngineer);
    }
    
}
