# [Giangbb Studio] - Spring Cloud Microservices Demo

## Environment
* Spring Boot 3
* JDK 17

## Servers
* Config Server with spring-cloud-config-server
* Naming Server with Eureka
* API Gateway Server with spring-cloud-gateway
* Zipkin Server with openzipkin/zipkin

## Services
* Monitoring with spring-boot-actuator
* Config client with spring-cloud-config
* Eureka client with spring-cloud-netflix-eureka-client
* Cross services call via Proxy client spring-cloud-openfeign
* Circuit Breaker, Retry, Rate Limiter, Bulkhead with resilience4j
* Distributed Tracing with Micrometer > OpenTelemetry > Zipkin
