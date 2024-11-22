package com.example.trelloback.demo.repository;

// src/main/java/com/example/trello/repository/BoardRepository.java


import com.example.trelloback.demo.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

}

