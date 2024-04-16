package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("myBalance")
    public String getBalancetDetails() {
        return "Here are the balance details from the db";
    }
}