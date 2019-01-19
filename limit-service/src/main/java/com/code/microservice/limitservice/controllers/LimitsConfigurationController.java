package com.code.microservice.limitservice.controllers;


import com.code.microservice.limitservice.config.LimitsJavaConfig;
import com.code.microservice.limitservice.model.LimitsBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    private LimitsJavaConfig config;

    public LimitsConfigurationController(LimitsJavaConfig config) {
        this.config = config;
    }

    @GetMapping("/limits")
    public LimitsBean limitsConfiguration(){
       return new LimitsBean(config.getMax(),config.getMin());
    }
}
