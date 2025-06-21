package com.thalesssribeiro.soulslike_sp.service;

import com.thalesssribeiro.soulslike_sp.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfilesService {

    final CharacterService characterService;
    final AttributePointsService attributePointService;
    final CharactersItemsService charactersItemsService;
    public ProfilesResponseDTO getProfileByCharacterID(Long characterID) {


        var characterDBO = characterService.findById(characterID);
        var attributeDBO = attributePointService.findByCharacterId(characterID);

        var attributePointsDTO = new AttributePointsResponseDTO(
                attributeDBO.getLevel(),
                attributeDBO.getVitality(),
                attributeDBO.getEndurance(),
                attributeDBO.getStrength(),
                attributeDBO.getIntelligence()
        );

        var characterFullResponseDTO = new CharacterFullResponseDTO(
                characterDBO.getName(),
                characterDBO.getBodyType(),
                characterDBO.getClazz(),
                attributePointsDTO
                );

        var itemsResponse = new ArrayList<ItemsFullResponseDTO>();
        charactersItemsService.findByCharacterId(characterID).forEach(i -> {
            var itemAcctionsDBO = i.getItemsDBO().getItemActionsDBO();
            var itemsActionsResponseDTO = new ItemsActionResponseDTO(
                    itemAcctionsDBO.getIsInfinite(),
                    itemAcctionsDBO.getIsUsable(),
                    itemAcctionsDBO.getIsDrop(),
                    itemAcctionsDBO.getAction()
            );
            var itemsFullResponseDTO = new ItemsFullResponseDTO(
                    i.getItemsDBO().getName(),
                    i.getItemsDBO().getType(),
                    itemsActionsResponseDTO,
                    i.getQuantity()
            );
            itemsResponse.add(itemsFullResponseDTO);

        });

        return new ProfilesResponseDTO(characterFullResponseDTO,itemsResponse);

    }

}
