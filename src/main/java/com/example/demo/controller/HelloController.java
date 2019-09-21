package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * BIULIU
 * 2019-09-21
 */
public class HelloController {
    @GetMapping("/hello")
    public String Hello(@RequestParam(name = "name")String name, Model model)
    {
        return "hello";
    }
}
