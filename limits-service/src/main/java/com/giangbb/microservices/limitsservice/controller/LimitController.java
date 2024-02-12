package com.giangbb.microservices.limitsservice.controller;

import com.giangbb.microservices.limitsservice.Configuration;
import com.giangbb.microservices.limitsservice.bean.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    private Configuration configuration;

    public LimitController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public Limits retrieveLimitsFromConfigurations() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
