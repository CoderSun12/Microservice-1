package com.sqx.orderservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class orderController {

    @Value("${text}")
    private String text;


    @GetMapping("/o")
    public String order(){
        return text;
    }

}
