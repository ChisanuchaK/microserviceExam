package com.example.limitsService.controller;

import com.example.limitsService.configuration.Configuration;
import com.example.limitsService.models.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
   private Configuration configuration;

    @GetMapping("/limits")
    public Limits callMaximumANdMinimum(){
        return new Limits(configuration.getMaximum() , configuration.getMinimum());
    }
}
