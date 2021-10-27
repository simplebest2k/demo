package com.example.test1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/main1")
    public String main1() {
        return "main1";
    }
}
