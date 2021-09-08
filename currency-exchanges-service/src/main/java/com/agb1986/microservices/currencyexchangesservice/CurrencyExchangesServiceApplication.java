package com.agb1986.microservices.currencyexchangesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableAutoConfiguration
public class CurrencyExchangesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangesServiceApplication.class, args);
	}

}
