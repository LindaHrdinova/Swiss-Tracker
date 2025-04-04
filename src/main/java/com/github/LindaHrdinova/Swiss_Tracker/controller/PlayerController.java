package com.github.LindaHrdinova.Swiss_Tracker.controller;

import com.github.LindaHrdinova.Swiss_Tracker.entity.Player;
import com.github.LindaHrdinova.Swiss_Tracker.entity.Division;
import com.github.LindaHrdinova.Swiss_Tracker.repository.PlayerRepository;
import com.github.LindaHrdinova.Swiss_Tracker.service.DivisionService;
import com.github.LindaHrdinova.Swiss_Tracker.service.PlayerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Controller
public class PlayerController {

    private final PlayerRepository playerRepository;
    private final PlayerService service;

    private final DivisionService divisionService;

    public PlayerController(PlayerRepository playerRepository, PlayerService service, DivisionService divisionService) {
        this.playerRepository = playerRepository;
        this.service = service;
        this.divisionService = divisionService;
    }

    @GetMapping("/addPlayer")
    public String addPlayer() {
        return "addPlayer";
    }

    @PostMapping("/addPlayer")
    public ModelAndView append(@ModelAttribute Player player) {
        service.append(player);
        return new ModelAndView("addPlayer");
    }

    @GetMapping("/playersList")
    public ModelAndView playersData() {
        ModelAndView modelAndView = new ModelAndView("playersList");

        // SELECT DISTINCT player_division FROM players;
        List<Player> players = service.getAll();
        List<Division> divisions = divisionService.getAll();

        /*Set<Long> divisions = players.stream()
                .map(player -> player.getDivision().getId())
                .collect(Collectors.toSet());*/

        modelAndView.addObject("players", players);
        modelAndView.addObject("divisions", divisions);
        return modelAndView;
    }

    @GetMapping("/editPlayer/{id:[0-9]+}")
    public ModelAndView detail(@PathVariable int id) {
        Player player = service.getById(id);
        if (player == null) {
            return new ModelAndView("redirect:/playersList"); // Přesměrování na seznam hráčů, pokud neexistuje
        }
        ModelAndView modelAndView = new ModelAndView("editPlayer");
        modelAndView.addObject("player", player);
        return modelAndView;
    }

    @PostMapping("/editPlayer")
    public ModelAndView updatePlayer(@ModelAttribute Player player) {
        service.updatePlayer(player.getPlayerId(), player);
        return new ModelAndView("redirect:/playersList");
    }

    @PostMapping("/deletePlayer")
    public String delete(@RequestParam Integer playerId) {
        service.deletePlayer(playerId);
        return "redirect:/playersList";
    }
}
