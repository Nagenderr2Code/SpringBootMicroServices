package com.code.microservice.currencyexchangeservice.service;

import com.code.microservice.currencyexchangeservice.entites.ExchangeEntity;
import com.code.microservice.currencyexchangeservice.repository.interfaces.ExchangeServiceRepository;
import com.code.microservice.currencyexchangeservice.service.interfaces.ExchangeServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExchangeServiceImpl implements ExchangeServiceI {

    @Autowired
    private ExchangeServiceRepository exchangeServiceRepository;

    @Override
    public ExchangeEntity findByFromAndTo(String fromCurrency, String toCurrency) {
        return exchangeServiceRepository.findByFromAndTo(fromCurrency, toCurrency);
    }
}
