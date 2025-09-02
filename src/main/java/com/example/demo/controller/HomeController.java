package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller no usages
public class HomeController {


    @GetMapping("/") no usages
    public String home() { return "index.html";}


}