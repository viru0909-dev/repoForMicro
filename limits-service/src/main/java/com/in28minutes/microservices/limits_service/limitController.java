package com.in28minutes.microservices.limits_service;

import com.in28minutes.microservices.limits_service.Configuration.Configuration;
import com.in28minutes.microservices.limits_service.bean.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class limitController {
    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(configuration.getMinimum(),configuration.getMaximum());
    }
}
