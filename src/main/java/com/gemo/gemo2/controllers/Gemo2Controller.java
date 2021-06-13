package com.gemo.gemo2.controllers;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Gemo2Controller {
    
    @GetMapping(value = "/ping")
    @ResponseBody
    public String ping()
    {
        return "hello! " + new Date().toString();
    }
}
