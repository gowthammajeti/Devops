package com.example.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello_world {

    @GetMapping("/hello")
    public String sample()
    {
        return "hello world";
    }
}
