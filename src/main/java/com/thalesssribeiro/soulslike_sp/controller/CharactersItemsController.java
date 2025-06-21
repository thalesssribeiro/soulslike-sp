package com.thalesssribeiro.soulslike_sp.controller;

import com.thalesssribeiro.soulslike_sp.dto.CharactersItemsDTO;
import com.thalesssribeiro.soulslike_sp.service.CharactersItemsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/characters-items")
@RequiredArgsConstructor

public class CharactersItemsController {

    final CharactersItemsService charactersItemsService;
    @PostMapping("/characters/{charactersID}/items/{itemsID}")
    public void createCharactersItems(@RequestBody CharactersItemsDTO charactersItemsDTO,
                                      @PathVariable("charactersID") Long charactersID,
                                      @PathVariable("itemsID") Long itemsID){

        charactersItemsService.createCharacterItems(charactersID,itemsID,charactersItemsDTO);
    }
}
