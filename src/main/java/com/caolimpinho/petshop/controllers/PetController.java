package com.caolimpinho.petshop.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pet")
public class PetController {

    @PostMapping
    public String createPet() {
        return "createPet";
    }
    @GetMapping
    public String getAllpet() {
        return "getAllpet";
    }
    @PutMapping
    public  String updatePet() {
        return "updatePet";
    }
    @DeleteMapping
    public String deletePet() {
        return "deletePet";
    }

}
