package com.github.LindaHrdinova.Swiss_Tracker.service;

import com.github.LindaHrdinova.Swiss_Tracker.entity.Tournament;
import org.springframework.stereotype.Service;

@Service
public class TournamentService {
    private Tournament tournament;

    public Tournament getTournament() {
        return tournament;
    }

    public void updateTournament(Tournament tournament) {
        this.tournament = tournament;
    }
}
