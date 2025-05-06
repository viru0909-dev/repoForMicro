package com.in28minutes.microservices.currency_exchange_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuitBreakerContoller {

    @GetMapping("/sample-api")
    public String sampleApi(){
        return "Sample API";
    }
}
