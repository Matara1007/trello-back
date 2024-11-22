package com.example.trelloback.demo.model;

// src/main/java/com/example/trello/model/Board.java

import jakarta.persistence.*;

@Entity
@Table(name = "boards")
public class Board {
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    @Id
    private Integer id;
    private String name;

    // Constructors
    public Board() {
    }

    public Board(String name) {
        this.name = name;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
