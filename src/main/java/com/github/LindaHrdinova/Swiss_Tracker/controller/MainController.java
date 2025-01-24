package com.github.LindaHrdinova.Swiss_Tracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.Period;

@Controller
public class MainController {
    @GetMapping("/")
    public ModelAndView homepage() {
        System.out.println("volám Controller ");

        ModelAndView result = new ModelAndView("homepage");
        result.addObject("");
        return result;
    }

    @GetMapping("/addPlayer")
    public String addPlayer() {

        return "addPlayer";
    }
}
