package com.reservas.reservarestaurante.model.mapper;

import com.reservas.reservarestaurante.model.dto.ClienteRequestDTO;
import com.reservas.reservarestaurante.model.dto.ClienteResponseDTO;
import com.reservas.reservarestaurante.model.entity.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    ClienteResponseDTO toDTO(Cliente cliente);

    List<ClienteResponseDTO> toDTOList(List<Cliente> clientes);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "reservas", ignore = true)
    Cliente toEntity(ClienteRequestDTO dto);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "reservas", ignore = true)
    void updateEntityFromDTO(ClienteRequestDTO dto, @MappingTarget Cliente cliente);
}