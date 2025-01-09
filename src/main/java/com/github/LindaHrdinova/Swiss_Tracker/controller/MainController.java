package com.github.LindaHrdinova.Swiss_Tracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @GetMapping("/")
    public String homepage() {
        System.out.println("volám Controller ");

        return "homepage";
    }

}
