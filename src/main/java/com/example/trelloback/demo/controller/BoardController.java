package com.example.trelloback.demo.controller;

import com.example.trelloback.demo.model.Board;
import com.example.trelloback.demo.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200") // Allow requests from Angular app
@RequestMapping("/api/boards") // Base path for this controller
public class BoardController {

    private final BoardRepository boardRepository;

    @Autowired
    public BoardController(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @GetMapping("/all") // Maps GET /api/boards/all
    public List<Board> getAllBoards() {
        return boardRepository.findAll(); // Fetches all boards from the database
    }

    @PostMapping("/add") // Maps POST /api/boards/add
    public Board addBoard(@RequestBody Board board) {
        return boardRepository.save(board); // Saves the new board to the database
    }
}
