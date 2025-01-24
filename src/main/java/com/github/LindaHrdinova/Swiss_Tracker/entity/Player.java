package com.github.LindaHrdinova.Swiss_Tracker.entity;

import java.time.LocalDate;
import java.time.Year;

public class Player {
    private int playerID;
    private String playerName;
    private LocalDate playerBirthday;

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
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
