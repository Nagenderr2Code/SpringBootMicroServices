package com.code.microservice.currencyconverterservice.controller;


import com.code.microservice.currencyconverterservice.model.CurrencyConverted;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/convert/{from}/to/{to}")
public class CurrencyConverterController {

    private String uri = "http://localhost:8000/exchange/{from}/to/{to}";

    @GetMapping("/{quantity}")
    public CurrencyConverted convert(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {

        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("from", from);
        uriVariables.put("to", to);

        /*ResponseEntity<CurrencyConverted> converted = new RestTemplate().getForEntity("http://localhost:8000/exchange/{from}/to/{to}",
                CurrencyConverted.class, uriVariables);

        CurrencyConverted currencyConverted = converted.getBody();
*/

        CurrencyConverted currencyConverted = new RestTemplate().getForObject("http://localhost:8000/exchange/{from}/to/{to}",
                CurrencyConverted.class, uriVariables);

        currencyConverted.setConvertedValue(currencyConverted.getConversionMultiple().multiply(quantity));
        return currencyConverted;
    }
}
