package com.jibin.springtutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

   // @RequestMapping(value = "/" , method = RequestMethod.GET) // To use oneline
    @GetMapping("/")
    public String helloWorld(){
        return "Welcome Jibin Developer #";
    }
}
