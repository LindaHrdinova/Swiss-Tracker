package com.github.LindaHrdinova.Swiss_Tracker.controller;

import com.github.LindaHrdinova.Swiss_Tracker.entity.Player;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {
    private final List<Player> players = new ArrayList<>();

    public PlayerService() {
        players.add(new Player(123, "Izzy Pity", LocalDate.of(2014, 3, 2)));
        players.add(new Player(315, "Česká Republika", LocalDate.of(1993, 1, 1)));
        players.add(new Player(4, "Charmander", LocalDate.of(1996, 2, 27)));
        players.add(new Player(514, "Pizza Tomato", LocalDate.of(2010, 10, 10)));
    }

    public List<Player> getAll() {
        return players;
    }

    public void append(Player player) {
        players.add(player);
    }
}
