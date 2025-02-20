package com.github.LindaHrdinova.Swiss_Tracker.controller;

import com.github.LindaHrdinova.Swiss_Tracker.entity.Organiser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class TournamentController {

    @GetMapping("/")
    public ModelAndView homepage() {
        System.out.println("volám Controller ");

        ModelAndView result = new ModelAndView("homepage");
        result.addObject("");
        return result;
    }

    @GetMapping("/tournamentData")
    public ModelAndView tournamentData() {
        Organiser organiser = new Organiser("Prerealise", "ČR", "Pokémon", 4, LocalDate.of(2025, 1, 24));
        ModelAndView modelAndView = new ModelAndView("organiserData");
        modelAndView.addObject("organiser", organiser);
        return modelAndView;
    }
}
