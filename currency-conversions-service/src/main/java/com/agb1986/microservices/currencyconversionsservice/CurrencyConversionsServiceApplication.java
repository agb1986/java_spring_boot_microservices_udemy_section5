package com.agb1986.microservices.currencyconversionsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.agb1986.microservices.currencyconversionsservice")
@EnableDiscoveryClient
public class CurrencyConversionsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionsServiceApplication.class, args);
	}

}
