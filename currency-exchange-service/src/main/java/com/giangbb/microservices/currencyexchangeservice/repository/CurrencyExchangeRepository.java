package com.giangbb.microservices.currencyexchangeservice.repository;

import com.giangbb.microservices.currencyexchangeservice.entity.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long>{
    CurrencyExchange findByFromAndTo(String from, String to);
}
