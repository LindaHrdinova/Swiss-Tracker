package com.github.LindaHrdinova.Swiss_Tracker.entity;

import java.time.LocalDate;

public class Organiser {
    private String tournamentName;
    private String organisedBy;
    private String tournamentType;
    private int tournamentRoundsNumber;
    private LocalDate tournamentDate;

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public String getOrganisedBy() {
        return organisedBy;
    }

    public void setOrganisedBy(String organisedBy) {
        this.organisedBy = organisedBy;
    }

    public String getTournamentType() {
        return tournamentType;
    }

    public void setTournamentType(String tournamentType) {
        this.tournamentType = tournamentType;
    }

    public int getTournamentRoundsNumber() {
        return tournamentRoundsNumber;
    }

    public void setTournamentRoundsNumber(int tournamentRoundsNumber) {
        this.tournamentRoundsNumber = tournamentRoundsNumber;
    }

    public LocalDate getTournamentDate() {
        return tournamentDate;
    }

    public void setTournamentDate(LocalDate tournamentDate) {
        this.tournamentDate = tournamentDate;
    }
}
