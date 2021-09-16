package com.agb1986.microservices.currencyconversionsservice.controllers;

import java.math.BigDecimal;

import com.agb1986.microservices.currencyconversionsservice.controllers.proxies.CurrencyExchangeServiceProxy;
import com.agb1986.microservices.currencyconversionsservice.models.CurrencyConversion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionsController {

    @Autowired
    private CurrencyExchangeServiceProxy currencyExchangeServiceProxy;

    @GetMapping(path = "curreny-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion convertCurrency(@PathVariable String from, @PathVariable String to,
            @PathVariable BigDecimal quantity) {

        // Map<String, String> uriVariables = new HashMap<>();
        // uriVariables.put("from", from);
        // uriVariables.put("to", to);
        // ResponseEntity<CurrencyConversion> responseEntity = new RestTemplate().getForEntity(
        //         "http://localhost:8000/currency-exchanges/from/{from}/to/{to}/", CurrencyConversion.class,
        //         uriVariables);

        // CurrencyConversion currencyConversionResponse = responseEntity.getBody();
        // BigDecimal conversionMultiple = currencyConversionResponse.getConversionMultiple();

        // CurrencyConversion currencyConversion = new CurrencyConversion(currencyConversionResponse.getId(), from, to,
        //         conversionMultiple, quantity, quantity.multiply(conversionMultiple));
        // int port = currencyConversionResponse.getPort();
        // currencyConversion.setPort(port);

        // return currencyConversion;

        CurrencyConversion currencyConversionResponse = currencyExchangeServiceProxy.retrieveExchangeValue(from, to);
        BigDecimal conversionMultiple = currencyConversionResponse.getConversionMultiple();
        CurrencyConversion currencyConversion = new CurrencyConversion(currencyConversionResponse.getId(), from, to,
                conversionMultiple, quantity, quantity.multiply(conversionMultiple));
        int port = currencyConversionResponse.getPort();
        currencyConversion.setPort(port);

        return currencyConversion;
    }

}
