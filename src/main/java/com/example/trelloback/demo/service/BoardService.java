package com.example.trelloback.demo.service;

// src/main/java/com/example/trello/service/BoardService.java


import com.example.trelloback.demo.model.Board;
import com.example.trelloback.demo.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public Iterable<Board> getAllBoards() {
        return boardRepository.findAll();
    }

    public Board createBoard(Board board) {
        return boardRepository.save(board);
    }

    // Additional methods for fetching, updating, and deleting boards
}

