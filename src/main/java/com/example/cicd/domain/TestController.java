package com.example.cicd.domain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hi")
    public String test(){
        return "짜잔! 내가 만든거야";
    }
}
