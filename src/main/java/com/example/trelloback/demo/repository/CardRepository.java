// src/main/java/com/example/trello/repository/CardRepository.java
package com.example.trelloback.demo.repository;

import com.example.trelloback.demo.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Long> {
    List<Card> findByListId(int listId);
}
