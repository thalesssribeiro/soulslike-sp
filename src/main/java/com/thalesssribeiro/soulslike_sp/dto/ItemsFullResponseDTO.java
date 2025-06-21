package com.thalesssribeiro.soulslike_sp.dto;

public record ItemsFullResponseDTO(
        String name,
        String type,
        ItemsActionResponseDTO itemsActionResponseDTO,
        Integer quantity
) {
}
