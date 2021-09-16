package com.agb1986.microservices.currencyconversionsservice.controllers.proxies;

import com.agb1986.microservices.currencyconversionsservice.models.CurrencyConversion;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchanges-service")
@RibbonClient(name = "currency-exchanges-service")
public interface CurrencyExchangeServiceProxy {
    @GetMapping(path = "/currency-exchanges/from/{from}/to/{to}")
    public CurrencyConversion retrieveExchangeValue(@PathVariable String from, @PathVariable String to);
}
