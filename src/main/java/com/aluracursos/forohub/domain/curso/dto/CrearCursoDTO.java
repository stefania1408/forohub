package com.aluracursos.forohub.domain.curso.dto;

import com.aluracursos.forohub.domain.curso.Categoria;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CrearCursoDTO(
        @NotBlank String name,
        @NotNull Categoria categoria) {
}