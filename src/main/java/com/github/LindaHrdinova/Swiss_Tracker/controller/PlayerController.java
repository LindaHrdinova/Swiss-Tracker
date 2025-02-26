package com.github.LindaHrdinova.Swiss_Tracker.controller;

import com.github.LindaHrdinova.Swiss_Tracker.entity.Player;
import com.github.LindaHrdinova.Swiss_Tracker.service.PlayerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PlayerController {
    private final PlayerService service;

    public PlayerController(PlayerService service) {
        this.service = service;
    }

    @GetMapping("/addPlayer")
    public String addPlayer() {

        return "addPlayer";
    }

    @PostMapping("/addPlayer")
    public ModelAndView append(Player player) {
        service.append(player);
        return new ModelAndView("addPlayer");
    }

    @GetMapping("/playersList")
    public ModelAndView playersData() {
        ModelAndView modelAndView = new ModelAndView("playersList");
        modelAndView.addObject("players", service.getAll());
        return modelAndView;
    }
}
