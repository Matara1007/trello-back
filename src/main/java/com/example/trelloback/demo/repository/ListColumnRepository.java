package com.example.trelloback.demo.repository;

// src/main/java/com/example/trello/repository/ListColumnRepository.java


import com.example.trelloback.demo.model.Card;
import com.example.trelloback.demo.model.ListColumn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListColumnRepository extends JpaRepository<ListColumn, Long> {
    List<ListColumn> findByBoardId(int board_Id); // Query based on the boardId property
}
