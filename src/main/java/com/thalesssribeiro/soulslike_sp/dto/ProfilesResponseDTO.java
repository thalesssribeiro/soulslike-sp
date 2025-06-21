package com.thalesssribeiro.soulslike_sp.dto;

import java.util.List;

public record ProfilesResponseDTO(
        CharacterFullResponseDTO characterFullResponseDTO,
        List<ItemsFullResponseDTO> itemsList
) {
}
