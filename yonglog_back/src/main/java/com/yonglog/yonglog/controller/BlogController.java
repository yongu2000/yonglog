package com.yonglog.yonglog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    @PostMapping("/posts")
    public String post(@RequestParam String title, @RequestParam String content) {
        return "Hello World";
    }
}
