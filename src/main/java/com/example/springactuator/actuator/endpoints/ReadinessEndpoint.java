package com.example.springactuator.actuator.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="readiness")
public class ReadinessEndpoint {

    private String status = "NOT_READY";

    @ReadOperation
    public String getStatus(){
        return status;
    }

    //When app ready, spring send applicationReadyEvent, and will trigger this method
    @EventListener(ApplicationReadyEvent.class)
    public void listenAppStatus(){
        status = "READY";
    }

//    @WriteOperation can use for restarting apps, or other action required when accessing actuator

}
