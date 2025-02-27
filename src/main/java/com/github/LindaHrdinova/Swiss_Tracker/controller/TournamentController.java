package com.github.LindaHrdinova.Swiss_Tracker.controller;

import com.github.LindaHrdinova.Swiss_Tracker.entity.Tournament;
import com.github.LindaHrdinova.Swiss_Tracker.service.TournamentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class TournamentController {

    private final TournamentService service;

    public TournamentController(TournamentService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ModelAndView homepage() {
        System.out.println("volám Controller ");

        ModelAndView modelAndView = new ModelAndView("homepage");
        modelAndView.addObject("tournament", service.getTournament());
        return modelAndView;
    }

    @PostMapping("/")
    public ModelAndView append(Tournament tournament) {
        service.updateTournament(tournament);
        return new ModelAndView("homepage");
    }

    @GetMapping("/editTournament")
    public  ModelAndView editTournamentData() {
        Tournament tournament = service.getTournament();
        if (tournament == null) {
            return new ModelAndView("redirect:/"); // Přesměrování na formulář pro vytvoření turnaje
        }
        ModelAndView modelAndView = new ModelAndView("editTournament");
        modelAndView.addObject("tournament", tournament);
        return modelAndView;
    }
}