package com.thalesssribeiro.soulslike_sp.controller;

import com.thalesssribeiro.soulslike_sp.dto.ProfilesResponseDTO;
import com.thalesssribeiro.soulslike_sp.service.ProfilesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profiles")
@RequiredArgsConstructor
public class ProfilesController {

    final ProfilesService profilesService;

    @GetMapping("characters/{characterID}")
    public ProfilesResponseDTO getProfiles(@PathVariable("characterID") Long characterID){

        return profilesService.getProfileByCharacterID(characterID);

    }
}
