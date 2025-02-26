package com.github.LindaHrdinova.Swiss_Tracker.entity;

import java.time.LocalDate;

public class Tournament {
    private String tournamentName;
    private String tournamentOrganizer;
    private String tournamentType;
    private int tournamentRounds;
    private LocalDate tournamentDate;

    public Tournament() {
    }

    public Tournament(String tournamentName, String tournamentOrganizer, String tournamentType, int tournamentRounds, LocalDate tournamentDate) {
        this.tournamentName = tournamentName;
        this.tournamentOrganizer = tournamentOrganizer;
        this.tournamentType = tournamentType;
        this.tournamentRounds = tournamentRounds;
        this.tournamentDate = tournamentDate;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public String getTournamentOrganizer() {
        return tournamentOrganizer;
    }

    public void setTournamentOrganizer(String tournamentOrganizer) {
        this.tournamentOrganizer = tournamentOrganizer;
    }

    public String getTournamentType() {
        return tournamentType;
    }

    public void setTournamentType(String tournamentType) {
        this.tournamentType = tournamentType;
    }

    public int getTournamentRounds() {
        return tournamentRounds;
    }

    public void setTournamentRounds(int tournamentRounds) {
        this.tournamentRounds = tournamentRounds;
    }

    public LocalDate getTournamentDate() {
        return tournamentDate;
    }

    public void setTournamentDate(LocalDate tournamentDate) {
        this.tournamentDate = tournamentDate;
    }
}
