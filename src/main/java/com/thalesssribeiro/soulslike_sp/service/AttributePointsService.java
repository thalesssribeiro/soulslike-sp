package com.thalesssribeiro.soulslike_sp.service;

import com.thalesssribeiro.soulslike_sp.dbo.AttributePointsDBO;
import com.thalesssribeiro.soulslike_sp.dto.AttributePointsRequestDTO;
import com.thalesssribeiro.soulslike_sp.repository.AttributePointRepository;
import org.springframework.stereotype.Service;

@Service

public record AttributePointsService(
        AttributePointRepository attributePointRepository,
        CharacterService characterService
) {

    public void createAttributePoints(Long characterId,
    AttributePointsRequestDTO attributePointsRequestDTO) {

        var characterDBO = characterService.findById(characterId);
        var attributePointsDBO = new AttributePointsDBO(
                0,
                attributePointsRequestDTO.vitality(),
                attributePointsRequestDTO.endurance(),
                attributePointsRequestDTO.strength(),
                attributePointsRequestDTO.intelligence(),
                characterDBO
        );

        attributePointRepository.save(attributePointsDBO);
    }

    public AttributePointsDBO findByCharacterId(Long characterID){
        var attributePoints = attributePointRepository.findByCharactersDBOId(characterID);

        if (attributePoints.isPresent()){
            return attributePoints.get();
        }

        throw new RuntimeException("Attribute Points não encontrado");
    }
}

