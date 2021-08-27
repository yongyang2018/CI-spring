package com.example.cispring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {

    @GetMapping(path = "/hello")
    public String hello() {
        return "hello world\n";
    }
}
