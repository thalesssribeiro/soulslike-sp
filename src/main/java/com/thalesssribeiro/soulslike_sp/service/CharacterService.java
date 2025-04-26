package com.thalesssribeiro.soulslike_sp.service;

import com.thalesssribeiro.soulslike_sp.dbo.CharactersDBO;
import com.thalesssribeiro.soulslike_sp.dto.CharacterRequestDto;
import com.thalesssribeiro.soulslike_sp.dto.CharacterResponseDto;
import com.thalesssribeiro.soulslike_sp.repository.CharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharacterService {

    private final CharacterRepository characterRepository;
    public CharacterResponseDto createNewCharacter(CharacterRequestDto characterRequestDto){

        var characterSaved = characterRepository.save(
                new CharactersDBO(
                        characterRequestDto.name(),
                        characterRequestDto.bodyType(),
                        characterRequestDto.clazz()
                )
        );

        return new CharacterResponseDto(characterSaved.getId());

    }
}
