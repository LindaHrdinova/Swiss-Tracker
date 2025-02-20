package com.github.LindaHrdinova.Swiss_Tracker.entity;

import java.time.LocalDate;

public class Player {
    private int playerId;
    private String playerName;
    private LocalDate playerBirthday;

    public Player() {
    }

    public Player(int playerId, String playerName, LocalDate playerBirthday) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.playerBirthday = playerBirthday;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public LocalDate getPlayerBirthday() {
        return playerBirthday;
    }

    public void setPlayerBirthday(LocalDate playerBirthday) {
        this.playerBirthday = playerBirthday;
    }

    public String getPlayerDivision() {
        String playerDivision;
        if (playerBirthday.getYear() >= 2013)
        {
            playerDivision = "junior";}
        else if (playerBirthday.getYear() >= 2009)
        {
            playerDivision = "senior";}
        else {
            playerDivision = "master";}
        return playerDivision;
    }

    /*
    Age Divisions in 2025 Official Competitions:

    Junior Division: Born in or after 2013
    Senior Division: Born between 2009 and 2012
    Masters Division: Born in or before 2008
     */
}
