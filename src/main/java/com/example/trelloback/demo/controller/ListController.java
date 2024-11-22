package com.example.trelloback.demo.controller;


import com.example.trelloback.demo.model.Card;
import com.example.trelloback.demo.model.ListColumn;
import com.example.trelloback.demo.repository.ListColumnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200") // Allow requests from Angular app
@RequestMapping("/api/lists") // Base path for this controller
public class ListController {

    private final ListColumnRepository listColumnRepository;

    @Autowired
    public ListController(ListColumnRepository listColumnRepository) {
        this.listColumnRepository = listColumnRepository;
    }

    @GetMapping("/all") // Maps GET /api/boards/all
    public List<ListColumn> getAllCards() {
        return listColumnRepository.findAll(); // Fetches all boards from the database
    }

    // New endpoint to fetch lists for a specific board
    @GetMapping("/by-board/{board_Id}")
    public List<ListColumn> getListsByBoardId(@PathVariable int board_Id) {
        return listColumnRepository.findByBoardId(board_Id);
    }

    @PostMapping("/add") // Maps POST /api/boards/add
    public ListColumn addListColumn(@RequestBody ListColumn listColumn) {
        System.out.println(listColumn);
        return listColumnRepository.save(listColumn); // Saves the new board to the database
    }
}

