package com.example.trelloback.demo.controller;

import com.example.trelloback.demo.model.Board;
import com.example.trelloback.demo.model.Card;
import com.example.trelloback.demo.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200") // Allow requests from Angular app
@RequestMapping("/api/cards") // Base path for this controller
public class CardController {

    private final CardRepository cardRepository;

    @Autowired
    public CardController(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @GetMapping("/all") // Maps GET /api/boards/all
    public List<Card> getAllCards() {
        return cardRepository.findAll(); // Fetches all boards from the database
    }

    // New endpoint to fetch cards for a specific list
    @GetMapping("/by-list/{listId}")
    public List<Card> getCardsByListId(@PathVariable int listId) {
        return cardRepository.findByListId(listId);
    }

    @PostMapping("/add") // Maps POST /api/boards/add
    public Card addCard(@RequestBody Card card) {
        return cardRepository.save(card); // Saves the new board to the database
    }

    @DeleteMapping("delete/{id}")
    public void deleteCard(@PathVariable Long id) {
        cardRepository.deleteById(id);
    }
}
