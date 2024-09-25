package com.exemplo.musculacao.exception;

public class ExercicioNaoEncontradoException extends RuntimeException {
    public ExercicioNaoEncontradoException(Long id) {
        super("Exercício com ID " + id + " não foi encontrado.");
    }
}
