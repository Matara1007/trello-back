package com.example.trelloback.demo.model;

// src/main/java/com/example/trello/model/Card.java

import jakarta.persistence.*;


@Entity
@Table (name = "cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private int position;
    private int listId;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getListId() {
        return listId;
    }

    public void setListId(int list_id) {
        this.listId = list_id;
    }
}

