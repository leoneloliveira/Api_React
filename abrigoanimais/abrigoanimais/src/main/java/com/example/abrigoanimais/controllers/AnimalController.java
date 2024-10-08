package com.exemplo.abrigosanimais.controller;

import com.exemplo.abrigosanimais.model.Animal;
import com.exemplo.abrigosanimais.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/animais")
public class AnimalController {
    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping
    public List<Animal> getAll() {
        return animalRepository.findAll();
    }

    @PostMapping
    public Animal create(@RequestBody Animal animal) {
        return animalRepository.save(animal);
    }

    @GetMapping("/{id}")
    public Animal getById(@PathVariable String id) {
        return animalRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Animal update(@PathVariable String id, @RequestBody Animal animal) {
        animal.setId(id);
        return animalRepository.save(animal);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        animalRepository.deleteById(id);
    }
}
