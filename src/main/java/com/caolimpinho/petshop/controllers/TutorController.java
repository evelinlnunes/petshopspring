package com.caolimpinho.petshop.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tutor")
public class TutorController {
    @PostMapping
    public String createTutor() {
        return "createTutor";
    }
    @GetMapping
    public String getAllTutor() {
        return "getAllTutor";
    }
    @PutMapping
    public  String updateTutor() {
        return "updateTutor";
    }
    @DeleteMapping
    public String deleteTutor() {
        return "deleteTutor";
    }
}
