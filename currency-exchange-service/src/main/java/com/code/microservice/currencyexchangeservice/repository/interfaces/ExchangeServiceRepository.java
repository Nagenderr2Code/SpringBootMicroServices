package com.code.microservice.currencyexchangeservice.repository.interfaces;

import com.code.microservice.currencyexchangeservice.entites.ExchangeEntity;
import org.springframework.data.repository.CrudRepository;

public interface ExchangeServiceRepository extends CrudRepository<ExchangeEntity, Integer> {

    public ExchangeEntity findByFromAndTo(String fromCurrency, String toCurrency);
}
