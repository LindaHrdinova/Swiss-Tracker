package com.github.LindaHrdinova.Swiss_Tracker.controller;

import com.github.LindaHrdinova.Swiss_Tracker.entity.Organiser;
import com.github.LindaHrdinova.Swiss_Tracker.entity.Player;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;

@Controller
public class MainController {
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

    ;

    @GetMapping("/addPlayer")
    public String addPlayer() {

        return "addPlayer";
    }

    @GetMapping("/playersList")
    public ModelAndView playersData() {
        final List<Player> playerList = List.of(
                new Player(123, "Izzy Pity", LocalDate.of(2014, 3, 2)),
                new Player(315, "Česká Republika", LocalDate.of(1993, 1, 1)),
                new Player(4, "Charmander", LocalDate.of(1996, 2, 27)),
                new Player(514, "Pizza Tomato", LocalDate.of(2010, 10, 10))
        );
        ModelAndView modelAndView = new ModelAndView("playersList");
        modelAndView.addObject("players", playerList);
        return modelAndView;
    }

    ;
}
