package com.agb1986.microservices.currencyexchangesservice.repository;

import com.agb1986.microservices.currencyexchangesservice.beans.ExchangeValue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
    ExchangeValue findByFromAndTo(String from, String to);
}
