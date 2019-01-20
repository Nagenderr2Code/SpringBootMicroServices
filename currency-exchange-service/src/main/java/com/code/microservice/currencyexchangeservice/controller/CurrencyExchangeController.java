package com.code.microservice.currencyexchangeservice.controller;


import com.code.microservice.currencyexchangeservice.entites.ExchangeEntity;
import com.code.microservice.currencyexchangeservice.service.interfaces.ExchangeServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/exchange/{from}/to")
public class CurrencyExchangeController {

    @Autowired
    Environment environment;

    @Autowired
    private ExchangeServiceI exchangeService;

    @GetMapping("/{to}")
    public ExchangeEntity convertCurrency(@PathVariable String from, @PathVariable String to){

        ExchangeEntity exchangeEntity= exchangeService.findByFromAndTo(from, to);

        exchangeEntity.setPort(Integer.parseInt(environment.getProperty("server.port")));
        return exchangeEntity;
    }

}
