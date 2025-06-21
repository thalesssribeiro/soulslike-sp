package com.thalesssribeiro.soulslike_sp.dto;

public record CharacterFullResponseDTO(
        String name,
        String bodyType,
        String clazz,
        AttributePointsResponseDTO attributePointsResponseDTO
) {
}
