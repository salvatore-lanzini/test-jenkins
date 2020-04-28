package com.example.testjenkins.controller;

import com.example.testjenkins.model.Hello;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("world")
    public ResponseEntity<Hello> helloWorld(){
        return ResponseEntity.ok(Hello.world());
    }
}
