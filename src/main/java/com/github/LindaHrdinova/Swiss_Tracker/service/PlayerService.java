package com.github.LindaHrdinova.Swiss_Tracker.service;

import com.github.LindaHrdinova.Swiss_Tracker.entity.Player;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {
    private final List<Player> players = new ArrayList<>();

    public List<Player> getAll() {
        return players;
    }

    public void append(Player player) {
        players.add(player);
    }
}
