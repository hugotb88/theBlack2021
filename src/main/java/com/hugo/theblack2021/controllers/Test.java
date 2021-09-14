package com.hugo.theblack2021.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {

    @GetMapping("/hello")
    public String testRest () {
        return "Hello Hugo, Welcome back";
    }

}
