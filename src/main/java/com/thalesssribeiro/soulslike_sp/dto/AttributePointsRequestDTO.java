package com.thalesssribeiro.soulslike_sp.dto;


public record AttributePointsRequestDTO(
        Integer vitality,
        Integer endurance,
        Integer strength,
        Integer intelligence
) {
}
