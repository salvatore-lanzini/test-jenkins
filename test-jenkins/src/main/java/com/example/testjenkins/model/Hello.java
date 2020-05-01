package com.example.testjenkins.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hello {
    @JsonProperty("Hello")
    private String hello;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public static Hello world(){
        Hello hello = new Hello();
        hello.setHello("World");
        return hello;
    }

    public static Hello name(String name){
        Hello hello = new Hello();
        hello.setHello(name);
        return hello;
    }
}
