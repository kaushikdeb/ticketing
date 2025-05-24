package com.kdeb.ticketing;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class First {

    @GetMapping("/")
    public String helloWorld(){
        return "Hi there...";
    }
    
}
