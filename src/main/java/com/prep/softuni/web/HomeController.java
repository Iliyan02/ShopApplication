package com.prep.softuni.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(HttpSession httpSession){
        if (httpSession.getAttribute("user") == null){
            return "index";
        }
        return "home";
    }

    @GetMapping("/home")
    public String home(){
        return "details-product";
    }
}
