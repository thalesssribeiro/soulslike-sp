package com.thalesssribeiro.soulslike_sp.service;

import com.thalesssribeiro.soulslike_sp.dbo.CharactersItemsDBO;
import com.thalesssribeiro.soulslike_sp.dto.CharactersItemsDTO;
import com.thalesssribeiro.soulslike_sp.repository.CharacterItemsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CharactersItemsService {

    private final CharacterItemsRepository characterItemsRepository;
    private final CharacterService characterService;
    private final ItemsService itemsService;
    public void createCharacterItems(Long charactersID, Long itemsID, CharactersItemsDTO charactersItemsDTO) {

        var characterDBO = characterService.findById(charactersID);
        var itemsDBO = itemsService.findById(itemsID);

        characterItemsRepository.save(
                new CharactersItemsDBO(
                        characterDBO,
                        itemsDBO,
                        charactersItemsDTO.quantity()
                )
        );
    }

    public List <CharactersItemsDBO> findByCharacterId(Long charaterID){
      return characterItemsRepository.findAllByCharactersDBOId(charaterID);
    };

}
