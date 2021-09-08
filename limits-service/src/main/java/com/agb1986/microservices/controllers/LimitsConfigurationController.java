package com.agb1986.microservices.controllers;

import com.agb1986.microservices.beans.Configuration;
import com.agb1986.microservices.beans.LimitsConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
    @Autowired
    private Configuration configuration;

    @GetMapping(path = "/limits")
    public LimitsConfiguration retrieveLimitsFromConfigurations() {
        return new LimitsConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
