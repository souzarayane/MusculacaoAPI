package com.exemplo.musculacao.service;

import com.exemplo.musculacao.model.Exercicio;
import com.exemplo.musculacao.repository.ExercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExercicioService {

    @Autowired
    private ExercicioRepository exercicioRepository;

    public List<Exercicio> listarTodos() {
        return exercicioRepository.findAll();
    }

    public Exercicio criarExercicio(Exercicio exercicio) {
        return exercicioRepository.save(exercicio);
    }

    public Exercicio atualizarExercicio(Long id, Exercicio exercicioAtualizado) {
        Exercicio exercicio = exercicioRepository.findById(id).orElseThrow();
        exercicio.setNome(exercicioAtualizado.getNome());
        exercicio.setGrupoMuscular(exercicioAtualizado.getGrupoMuscular());
        exercicio.setRepeticoes(exercicioAtualizado.getRepeticoes());
        exercicio.setSeries(exercicioAtualizado.getSeries());
        return exercicioRepository.save(exercicio);
    }

    public void deletarExercicio(Long id) {
        exercicioRepository.deleteById(id);
    }
}
