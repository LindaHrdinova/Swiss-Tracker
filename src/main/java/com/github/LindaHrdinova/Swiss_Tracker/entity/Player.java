package com.github.LindaHrdinova.Swiss_Tracker.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "player")
public class Player {
    @Id
    private Integer playerId;
    private String name;
    private LocalDate birthday;
    private int score;
    private boolean bye;
    private String status;

    @ManyToOne
    @JoinColumn(name = "division_id", nullable = false)
    private Division division;

    public Player() {
    }

    public Player(Integer playerId, String name, LocalDate birthday, int score, boolean bye, String status) {
        this.playerId = playerId;
        this.name = name;
        this.birthday = birthday;
        this.score = score;
        this.bye = bye;
        this.status = status;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean getBye() {
        return bye;
    }

    public void setBye(boolean bye) {
        this.bye = bye;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /*
    Age Divisions in 2025 Official Competitions:

    Junior Division: Born in or after 2013
    Senior Division: Born between 2009 and 2012
    Masters Division: Born in or before 2008
     */
}



