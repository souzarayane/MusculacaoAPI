package com.exemplo.musculacao.repository;

import com.exemplo.musculacao.model.Exercicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExercicioRepository extends JpaRepository<Exercicio, Long> {
}
