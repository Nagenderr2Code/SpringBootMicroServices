package com.code.microservice.limitservice.controllers;


import com.code.microservice.limitservice.config.LimitsJavaConfig;
import com.code.microservice.limitservice.model.LimitsBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    private LimitsJavaConfig config;

    @Value("${max}")
    private int maxLimit;

    @Value("${min}")
    private int minLimit;

    public LimitsConfigurationController(LimitsJavaConfig config) {
        this.config = config;
    }

    @GetMapping("/limits")
    public LimitsBean limitsConfiguration(){
       return new LimitsBean(maxLimit, minLimit);
    }
}
