package com.github.LindaHrdinova.Swiss_Tracker.service;

import com.github.LindaHrdinova.Swiss_Tracker.entity.Player;
import com.github.LindaHrdinova.Swiss_Tracker.entity.Tournament;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TournamentService {
    private Tournament tournament;

    public TournamentService() {
        //testing data
        this.tournament = new Tournament("Prerealise", "ČR", "Pokémon", 4, LocalDate.of(2025, 1, 24));
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void updateTournament(Tournament tournament) {
        this.tournament = tournament;
    }
}
