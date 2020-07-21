package com.example.springactuator.actuator.custom;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class CustomInfoIndicator implements InfoContributor {

    //access by /actuator/info
    //can mark support team here, so in production when issue occur can quicky access to right team
    @Override
    public void contribute(Builder builder) {
        builder.withDetail("microservice_name","account service ms")
                .withDetail("maintanence_team","Super Boy")
                .withDetail("email","superboy@support.com");
    }
}
