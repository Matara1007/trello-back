package com.example.trelloback.demo.model;

// src/main/java/com/example/trello/model/ListColumn.java


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "lists")
public class ListColumn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(name = "board_id") // Map to the database column "board_id"
    private int boardId;
    private int position;

    // Getters and Setters
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

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int board_id) {
        this.boardId = board_id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}

