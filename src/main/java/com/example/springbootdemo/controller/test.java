package com.example.springbootdemo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @RequestMapping("hello")
    public String h(){
        return "hello world";
    }
}
