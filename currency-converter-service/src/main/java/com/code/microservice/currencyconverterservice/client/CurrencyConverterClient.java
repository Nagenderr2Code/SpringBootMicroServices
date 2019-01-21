package com.code.microservice.currencyconverterservice.client;

import com.code.microservice.currencyconverterservice.model.CurrencyConverted;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange")
@RibbonClient
public interface CurrencyConverterClient {

    @GetMapping("/exchange/{from}/to/{to}")
    public CurrencyConverted convert(@PathVariable String from, @PathVariable String to);

    }
