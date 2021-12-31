package com.example.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome to Spring Boot Application!";
    }

    @GetMapping("/hello/{name}")
    public String sayHelloToUser(@PathVariable String name) {
        return "Welcome to Spring Boot Application! Hello " + name;
    }

}
