package com.thalesssribeiro.soulslike_sp.dto;

public record ItemActionsDTO(
        Boolean isInfinite,
        Boolean isUsable,
        Boolean isDrop,
        Boolean action) {
}
