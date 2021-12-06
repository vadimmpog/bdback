package com.example.bdback.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {

    @GetMapping("/page")
    public String showUserPage() {
        return "table";
    }

    @GetMapping("/register")
    public String showRegisterPage() {
        return "registration";
    }

}
