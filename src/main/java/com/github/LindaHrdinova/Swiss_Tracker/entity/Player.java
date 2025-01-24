package com.github.LindaHrdinova.Swiss_Tracker.entity;

import java.time.LocalDate;

public class Player {
    private int playerID;
    private String playerName;
    private LocalDate playerBirthday;
    private String playerDivision;

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
        return playerDivision;
    }

    public void setPlayerDivision(String playerDivision) {
        this.playerDivision = playerDivision;
    }
}
