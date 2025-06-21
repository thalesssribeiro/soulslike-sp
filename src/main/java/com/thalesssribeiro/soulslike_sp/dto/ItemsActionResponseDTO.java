package com.thalesssribeiro.soulslike_sp.dto;

public record ItemsActionResponseDTO(
        Boolean isInfinite,
        Boolean isUsable,
        Boolean isDrop,
        Boolean action
) {
}
