package com.registry.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekServerRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekServerRegistryApplication.class, args);
    }

}
