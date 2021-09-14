package com.duck.demobackend.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DuckController {

    @GetMapping("/api/version")
    public String version(){
        return "1.0";
    }

    @GetMapping("/api/duckssay")
    public String duckssay(){
        return "Quack";
    }
}
