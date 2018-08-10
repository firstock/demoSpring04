package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "HelloController::Greetings from Spring Boot!";
    }

//    @RequestMapping("/health")
//    public String myActuator(){ return "health check example";}
}
