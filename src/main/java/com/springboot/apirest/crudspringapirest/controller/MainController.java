package com.springboot.apirest.crudspringapirest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test/")
public class MainController {
    
    @GetMapping
    public @ResponseBody String test(){
        return "Test OK!";
    }
}
