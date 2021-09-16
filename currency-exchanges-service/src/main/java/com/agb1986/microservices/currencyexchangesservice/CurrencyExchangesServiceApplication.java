package com.agb1986.microservices.currencyexchangesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableAutoConfiguration
@EnableDiscoveryClient
public class CurrencyExchangesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangesServiceApplication.class, args);
	}

}
