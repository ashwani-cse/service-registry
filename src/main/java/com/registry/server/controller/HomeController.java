package com.registry.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ashwani Kumar
 * Created on 23/02/24.
 */

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String home() {
        return "Welcome to the home page!";
    }
}
