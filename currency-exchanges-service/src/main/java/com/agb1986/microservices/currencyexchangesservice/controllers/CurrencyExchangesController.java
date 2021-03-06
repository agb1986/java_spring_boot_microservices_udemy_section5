package com.agb1986.microservices.currencyexchangesservice.controllers;

import com.agb1986.microservices.currencyexchangesservice.beans.ExchangeValue;
import com.agb1986.microservices.currencyexchangesservice.repository.ExchangeValueRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangesController {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private Environment environment;

    @Autowired
    private ExchangeValueRepository repository;

    @GetMapping(path = "/currency-exchanges/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
        ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
        int port = Integer.parseInt(environment.getProperty("local.server.port"));
        exchangeValue.setPort(port);
        logger.info("{}", exchangeValue);
        return exchangeValue;
    }
}
