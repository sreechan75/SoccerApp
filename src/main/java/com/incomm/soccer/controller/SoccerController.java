package com.incomm.soccer.controller;

import com.incomm.soccer.model.Player;
import com.incomm.soccer.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class SoccerController {

    @Autowired
    PlayerRepository playerRepository;

    @GetMapping("/hello")
    public String hello() {
        return "Hello Soccer!";
    }

    @GetMapping("/player/{id}")
    public Optional<Player> getPlayer(@PathVariable Integer id) {
        //return "ID: "+id;
        return playerRepository.findById(id);
    }

    @GetMapping("/player/all")
    public Iterable<Player> getPlayers() {
        return playerRepository.findAll();
    }

}
