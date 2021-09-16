package com.agb1986.microservices.currencyconversionsservice.models;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CurrencyConversion {
    @NonNull
    private Long id;

    @NonNull
    private String from;
    
    @NonNull
    private String to;

    @NonNull
    private BigDecimal conversionMultiple;

    @NonNull
    private BigDecimal quantity;

    @NonNull
    private BigDecimal totalCalculation;

    private int port;
}
