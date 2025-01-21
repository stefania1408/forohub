package com.aluracursos.forohub.domain.respuesta.validations.update;


import com.aluracursos.forohub.domain.respuesta.dto.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {

    void validate(ActualizarRespuestaDTO data, Long respuestaId);
}