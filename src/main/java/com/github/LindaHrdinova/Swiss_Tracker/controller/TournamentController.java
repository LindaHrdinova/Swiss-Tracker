package com.github.LindaHrdinova.Swiss_Tracker.controller;

import com.github.LindaHrdinova.Swiss_Tracker.entity.Player;
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

        ModelAndView result = new ModelAndView("homepage");
        result.addObject("");
        return result;
    }
    
    @PostMapping("/tournamentData")
    public ModelAndView append(Tournament tournament) {
        service.updateTournament(tournament);
        return new ModelAndView("tournamentData");
    }

    @GetMapping("/tournamentData")
    public ModelAndView tournamentData() {
        Tournament tournament = new Tournament("Prerealise", "ČR", "Pokémon", 4, LocalDate.of(2025, 1, 24));
        ModelAndView modelAndView = new ModelAndView("tournamentData");
        modelAndView.addObject("tournament", tournament);
        return modelAndView;
    }
}
