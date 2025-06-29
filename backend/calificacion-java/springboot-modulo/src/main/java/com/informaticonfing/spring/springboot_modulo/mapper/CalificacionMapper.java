package com.informaticonfing.spring.springboot_modulo.mapper;

import com.informaticonfing.spring.springboot_modulo.dto.*;
import com.informaticonfing.spring.springboot_modulo.model.Calificacion;
import com.informaticonfing.spring.springboot_modulo.model.ParametrosIdeales;
import com.informaticonfing.spring.springboot_modulo.model.DetalleCalificacion;

public class CalificacionMapper {

    // Convierte un DTO de petición a entidad
    public static Calificacion toEntity(CalificacionRequestDTO dto, ParametrosIdeales parametrosIdeales) {
        Calificacion c = new Calificacion();
        c.setGrabacionId(dto.getGrabacionId());
        c.setUsuarioId(dto.getUsuarioId());
        c.setPuntajeGlobal(dto.getPuntajeGlobal());
        c.setObservacionGlobal(dto.getObservacionGlobal());
        c.setTipoCalificacion(dto.getTipoCalificacion());
        c.setParametrosIdeales(parametrosIdeales);
        return c;
    }

    // Convierte una entidad a DTO de respuesta
    public static CalificacionResponseDTO toDTO(Calificacion c) {
        return toDTO(c, null);
    }

    // Convierte una entidad y su lista de detalles a DTO de respuesta
    public static CalificacionResponseDTO toDTO(Calificacion c, java.util.List<DetalleCalificacion> detalles) {
        CalificacionResponseDTO dto = new CalificacionResponseDTO();
        dto.setId(c.getId());
        dto.setGrabacionId(c.getGrabacionId());
        dto.setUsuarioId(c.getUsuarioId());
        dto.setPuntajeGlobal(c.getPuntajeGlobal());
        dto.setObservacionGlobal(c.getObservacionGlobal());
        dto.setTipoCalificacion(c.getTipoCalificacion());
        if (c.getParametrosIdeales() != null) {
            dto.setParametrosIdealesId(c.getParametrosIdeales().getId());
        }
        if (detalles != null) {
            java.util.List<DetalleCalificacionResponseDTO> detalleDtos = detalles.stream()
                .map(DetalleCalificacionMapper::toDTO)
                .toList();
            dto.setDetalles(detalleDtos);
        }
        return dto;
    }
}
