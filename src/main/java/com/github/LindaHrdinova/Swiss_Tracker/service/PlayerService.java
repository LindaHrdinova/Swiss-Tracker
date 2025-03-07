package com.github.LindaHrdinova.Swiss_Tracker.service;

import com.github.LindaHrdinova.Swiss_Tracker.entity.Player;
import com.github.LindaHrdinova.Swiss_Tracker.entity.Tournament;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    private final List<Player> players = new ArrayList<>();

    public List<Player> getAll() {
        return players;
    }


    public void append(Player player) {
        players.add(player);
    }

    public Player getById(int playerId) {
        return players.stream() // Stream through the players list
                .filter(player -> player.getPlayerId() == playerId) // Filter by matching player ID
                .findFirst() // Return the first match
                .orElse(null); // Return null if no player found
    }

    public void updatePlayer(int playerId, Player updatedPlayer) {
        // Find the player by ID
        Optional<Player> playerOptional = players.stream()
                .filter(player -> player.getPlayerId() == playerId) // Filter by player ID
                .findFirst(); // Get the first matching player (if any)

        // If player is found, update their details
        if (playerOptional.isPresent()) {
            Player player = playerOptional.get(); // Get the player from the Optional
            player.setPlayerName(updatedPlayer.getPlayerName()); // Update player name
            player.setPlayerBirthday(updatedPlayer.getPlayerBirthday()); // Update player birthdate
        } else {
            // Log message if player with the given ID is not found
            System.out.println("Player with ID " + playerId + " not found.");
        }
    }

    public void deletePlayer(int playerId) {
        // Remove the player with the matching player ID from the list
        players.removeIf(player -> player.getPlayerId() == playerId);
    }
}
