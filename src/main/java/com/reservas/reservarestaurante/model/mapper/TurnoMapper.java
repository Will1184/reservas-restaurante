package com.reservas.reservarestaurante.model.mapper;

import com.reservas.reservarestaurante.model.dto.TurnoRequestDTO;
import com.reservas.reservarestaurante.model.dto.TurnoResponseDTO;
import com.reservas.reservarestaurante.model.entity.Turno;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TurnoMapper {

    TurnoResponseDTO toDTO(Turno turno);

    List<TurnoResponseDTO> toDTOList(List<Turno> turnos);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "reservas", ignore = true)
    Turno toEntity(TurnoRequestDTO dto);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "reservas", ignore = true)
    void updateEntityFromDTO(TurnoRequestDTO dto, @MappingTarget Turno turno);
}