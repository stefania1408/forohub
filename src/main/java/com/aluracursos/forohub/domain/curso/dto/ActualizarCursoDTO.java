package com.aluracursos.forohub.domain.curso.dto;


import com.aluracursos.forohub.domain.curso.Categoria;

public record ActualizarCursoDTO(
        String name,
        Categoria categoria,
        Boolean activo) {
}