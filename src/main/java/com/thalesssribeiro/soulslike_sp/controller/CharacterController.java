package com.thalesssribeiro.soulslike_sp.controller;

import com.thalesssribeiro.soulslike_sp.dto.CharacterRequestDto;
import com.thalesssribeiro.soulslike_sp.dto.CharacterResponseDto;
import com.thalesssribeiro.soulslike_sp.service.CharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characters")
@RequiredArgsConstructor
public class CharacterController {

    private final CharacterService characterService;
    @PostMapping
    public CharacterResponseDto createCharacter(@RequestBody CharacterRequestDto characterRequestDto){
        return characterService.createNewCharacter(characterRequestDto);
    }
}
