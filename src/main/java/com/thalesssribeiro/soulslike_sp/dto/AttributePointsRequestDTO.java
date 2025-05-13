package com.thalesssribeiro.soulslike_sp.dto;

import jakarta.persistence.criteria.CriteriaBuilder;

public record AttributePointsRequestDTO(
        Integer vitality,
        Integer endurance,
        Integer strength,
        Integer intelligence
) {
}
