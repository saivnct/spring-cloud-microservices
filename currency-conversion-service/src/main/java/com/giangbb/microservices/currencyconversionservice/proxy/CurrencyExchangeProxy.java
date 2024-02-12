package com.giangbb.microservices.currencyconversionservice.proxy;


import com.giangbb.microservices.currencyconversionservice.model.CurrencyConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//the same name as the application name in the properties file of exchange service
//@FeignClient(name = "currency-exchange", url = "localhost:8000")  //not using eureka => must specify the url
@FeignClient(name = "currency-exchange")    //using eureka with load balancing
public interface CurrencyExchangeProxy {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversion retrieveExchangeValue(
            @PathVariable String from,
            @PathVariable String to);
}
