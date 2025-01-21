package com.aluracursos.forohub.domain.topico.dto;

import com.aluracursos.forohub.domain.topico.Estado;

public record ActualizarTopicoDTO (
        String titulo,
        String mensaje,
        Estado estado,
        Long cursoId
){
}