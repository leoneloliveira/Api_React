package com.exemplo.abrigosanimais.controller;

import com.exemplo.abrigosanimais.model.Adocao;
import com.exemplo.abrigosanimais.repository.AdocaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/adocoes")
public class AdocaoController {
    @Autowired
    private AdocaoRepository adocaoRepository;

    @GetMapping
    public List<Adocao> getAll() {
        return adocaoRepository.findAll();
    }

    @PostMapping
    public Adocao create(@RequestBody Adocao adocao) {
        return adocaoRepository.save(adocao);
    }

    @GetMapping("/{id}")
    public Adocao getById(@PathVariable String id) {
        return adocaoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        adocaoRepository.deleteById(id);
    }
}
