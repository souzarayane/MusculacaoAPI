package com.exemplo.musculacao.controller;

import com.exemplo.musculacao.model.Exercicio;
import com.exemplo.musculacao.service.ExercicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exercicios")
public class ExercicioController {

    @Autowired
    private ExercicioService exercicioService;

    @GetMapping
    public List<Exercicio> listarTodos() {
        return exercicioService.listarTodos();
    }

    @PostMapping
    public Exercicio criarExercicio(@RequestBody Exercicio exercicio) {
        return exercicioService.criarExercicio(exercicio);
    }

    @PutMapping("/{id}")
    public Exercicio atualizarExercicio(@PathVariable Long id, @RequestBody Exercicio exercicio) {
        return exercicioService.atualizarExercicio(id, exercicio);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarExercicio(@PathVariable Long id) {
        exercicioService.deletarExercicio(id);
        return ResponseEntity.noContent().build();
    }
}
