package com.example.first_site_spring.controller;

import com.example.first_site_spring.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class MessageController {

    @GetMapping("/message")
    public String message() {
        return "Olá! Esta é sua primeira API REST com Spring Boot!";
    }

    @GetMapping("/person")
    public Person person(@RequestParam String name, @RequestParam int age) {
        return new Person(name, age);
    }
}
