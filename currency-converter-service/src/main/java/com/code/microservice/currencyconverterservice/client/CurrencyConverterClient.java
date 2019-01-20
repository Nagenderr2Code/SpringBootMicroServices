package com.code.microservice.currencyconverterservice.client;

import com.code.microservice.currencyconverterservice.model.CurrencyConverted;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-converter", url = "http://localhost:8000")
public interface CurrencyConverterClient {

    @GetMapping("/exchange/{from}/to/{to}")
    public CurrencyConverted convert(@PathVariable String from, @PathVariable String to);

    }
