package com.github.LindaHrdinova.Swiss_Tracker.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "DIVISION")
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    public Division(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Division() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


