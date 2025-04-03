package com.github.LindaHrdinova.Swiss_Tracker.service;

import com.github.LindaHrdinova.Swiss_Tracker.entity.Division;
import com.github.LindaHrdinova.Swiss_Tracker.entity.Player;
import com.github.LindaHrdinova.Swiss_Tracker.repository.DivisionRepository;
import com.github.LindaHrdinova.Swiss_Tracker.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    private final DivisionRepository divisionRepository;

    public PlayerService(PlayerRepository playerRepository, DivisionRepository divisionRepository) {
        this.playerRepository = playerRepository;
        this.divisionRepository = divisionRepository;  // Nastavit divisionRepository přes konstruktor
    }
    public List<Player> getAll() {
        return (List<Player>) playerRepository.findAll();
    }

    public void append(Player player) {
        Long divisionId = getDivisionId(player.getBirthday());  // Získáme ID divize
        Division division = divisionRepository.findById(divisionId)
                .orElseThrow(() -> new RuntimeException("Division not found"));
        player.setDivision(division);  // Přiřadíme objekt divize
        playerRepository.save(player);
    }

    public Long getDivisionId(LocalDate birthday) {
        if (birthday.getYear() >= 2013) {
            return 1L;
        } else if (birthday.getYear() >= 2009) {
            return 2L;
        } else {
            return 3L;
        }
    }

    public Player getById(Integer playerId) {
        return playerRepository.findById(playerId).orElse(null);
    }

    public void updatePlayer(Integer playerId, Player updatedPlayer) {
        // Find the player by ID
        Optional<Player> playerOptional = playerRepository.findById(playerId);

        if (playerOptional.isPresent()) {
            Player player = playerOptional.get(); // Get the player from the Optional
            player.setName(updatedPlayer.getName()); // Update player name
            player.setBirthday(updatedPlayer.getBirthday()); // Update player birthdate
            playerRepository.save(player);
        } else {
            // Log message if player with the given ID is not found
            System.out.println("Player with ID " + playerId + " not found.");
        }
    }

    public void deletePlayer(Integer playerId) {
        playerRepository.deleteById(playerId);
    }
}
