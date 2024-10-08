package com.exemplo.abrigosanimais.controller;

import com.exemplo.abrigosanimais.model.Abrigo;
import com.exemplo.abrigosanimais.repository.AbrigoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/abrigos")
public class AbrigoController {
    @Autowired
    private AbrigoRepository abrigoRepository;

    @GetMapping
    public List<Abrigo> getAll() {
        return abrigoRepository.findAll();
    }

    @PostMapping
    public Abrigo create(@RequestBody Abrigo abrigo) {
        return abrigoRepository.save(abrigo);
    }

    @GetMapping("/{id}")
    public Abrigo getById(@PathVariable String id) {
        return abrigoRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Abrigo update(@PathVariable String id, @RequestBody Abrigo abrigo) {
        abrigo.setId(id);
        return abrigoRepository.save(abrigo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        abrigoRepository.deleteById(id);
    }
}
