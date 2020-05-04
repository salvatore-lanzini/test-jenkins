package com.example.testjenkins.controller;

import com.example.testjenkins.model.Hello;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("world")
    public ResponseEntity<Hello> helloWorld(){
        return ResponseEntity.ok(Hello.world());
    }

    @GetMapping("name")
    public ResponseEntity<Hello> helloName(@RequestParam String name){ return ResponseEntity.ok(Hello.name(name)); }

    @GetMapping("test")
    public ResponseEntity<Hello> helloTest(@RequestParam String test){ return ResponseEntity.ok(Hello.name(test)); }

    @GetMapping("test2")
    public ResponseEntity<Hello> helloTest2(@RequestParam String test){ return ResponseEntity.ok(Hello.name(test)); }
}
