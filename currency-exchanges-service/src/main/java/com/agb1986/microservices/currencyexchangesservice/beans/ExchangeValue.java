package com.agb1986.microservices.currencyexchangesservice.beans;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ExchangeValue {
    
    @NonNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NonNull
    @Column(name = "exchange_from")
    private String from;
    
    @NonNull
    @Column(name = "exchange_to")
    private String to;
    
    @NonNull
    private BigDecimal conversionMultiple;
    
    private int port;
}
