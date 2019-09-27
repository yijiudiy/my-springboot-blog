package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * BIULIU
 * 2019-09-21
 */
public class IndexController {
    @GetMapping("/")
    public String index(@RequestParam(name = "name")String name, Model model)
    {
        return "index";
    }
}
