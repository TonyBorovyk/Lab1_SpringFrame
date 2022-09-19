package com.example.webdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {
    @GetMapping("/")
    @ResponseBody
    public String helloWorld() {
        return "Hello world";
    }

    @GetMapping("/andrii")
    public String andrii() {
        return "Andrii";
    }

    @GetMapping("/anton")
    public String anton() {
        return "Anton";
    }

}
