package com.github.LindaHrdinova.Swiss_Tracker.controller;

import com.github.LindaHrdinova.Swiss_Tracker.entity.Player;
import com.github.LindaHrdinova.Swiss_Tracker.entity.Tournament;
import com.github.LindaHrdinova.Swiss_Tracker.service.PlayerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

        // SELECT DISTINCT player_division FROM players;
        List<Player> players = service.getAll();

        Set<String> divisions = players.stream()
                .map(Player::getPlayerDivision)
                .collect(Collectors.toSet());

        modelAndView.addObject("players", players);
        modelAndView.addObject("divisions", divisions);
        return modelAndView;
    }

    @GetMapping("/editPlayer/{id}")
    public ModelAndView detail(@PathVariable int id) {
        Player player = service.getById(id);
        ModelAndView modelAndView = new ModelAndView("editPlayer");
        modelAndView.addObject("player", player);
        return modelAndView;
    }

    @PostMapping("/editPlayer")
    public ModelAndView updatePlayer(Player player) {
        service.updatePlayer(player.getPlayerId(), player);
        return new ModelAndView("redirect:/playersList");
    }

    @PostMapping("/deletePlayer")
    public String delete(int playerId) {
        service.deletePlayer(playerId);
        return "redirect:/playersList";
    }
}
