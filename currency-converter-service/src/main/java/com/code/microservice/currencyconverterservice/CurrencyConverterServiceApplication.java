package com.code.microservice.currencyconverterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.code.microservice.currencyconverterservice")
public class CurrencyConverterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConverterServiceApplication.class, args);
	}

}

