package com.registry.server.controller;

import lombok.AllArgsConstructor;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Ashwani Kumar
 * Created on 23/02/24.
 */

//@RestController
@AllArgsConstructor
public class ServiceInstanceRestController {

    private final DiscoveryClient discoveryClient;

    @GetMapping("/service-instances/{applicationName}")
    public ResponseEntity<List<ServiceInstance>> serviceInstancesByApplicationName(@PathVariable String applicationName) {
        List<ServiceInstance> instances = this.discoveryClient.getInstances(applicationName);
        return new ResponseEntity<>(instances, HttpStatus.OK);
    }

    @GetMapping("/services")
    public ResponseEntity<List<String>> registeredServices() {
        List<String> registeredService = this.discoveryClient.getServices();
        return new ResponseEntity<>(registeredService, HttpStatus.OK);
    }

}
