package com.code.microservice.currencyexchangeservice.service.interfaces;

import com.code.microservice.currencyexchangeservice.entites.ExchangeEntity;

public interface ExchangeServiceI{

    public ExchangeEntity findByFromAndTo(String fromCurrency, String toCurrency);
}
