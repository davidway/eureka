package com.my.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeverController {
    @GetMapping("msg")
    public String msg(){
        Rest
        return " this is productx msg";
    }

}
