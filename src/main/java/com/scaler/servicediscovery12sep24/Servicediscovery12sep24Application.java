package com.scaler.servicediscovery12sep24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Servicediscovery12sep24Application {

    public static void main(String[] args) {
        SpringApplication.run(Servicediscovery12sep24Application.class, args);
    }

}
