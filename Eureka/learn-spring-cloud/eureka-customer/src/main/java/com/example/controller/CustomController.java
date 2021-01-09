package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/custom/callHello")
    public String callHello(){return restTemplate.getForObject("http://localhost:8081/user/hello",String.class);}
}
