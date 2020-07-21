package com.example.springactuator.actuator.custom;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

    //things will affect when access {{domain.url}}/actuator/health
    @Override
    public Health health() {
        //may perform another checking on legacy system here (via api etc)

        return Health.down()
                .withDetail("Legacy", "up")
                .withDetail("response_ms", "121ms")
                .withDetail("MQ", "up")
                .withDetail("MQ size", "xxx MB")
                .withDetail("DB Ping", "xxx ms")
                .build();
//        return Health.down().build();
    }
}
