package com.tcfj.recipients.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by andrew.larsen on 1/22/2017.
 */
@RestController
public class HealthCheckEndpoint {

    @RequestMapping("health")
    public String healthCheck(){
        return "UP";
    }
}
