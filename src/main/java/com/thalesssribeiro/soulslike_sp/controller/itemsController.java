package com.thalesssribeiro.soulslike_sp.controller;

import com.thalesssribeiro.soulslike_sp.dto.ItemsRequestDTO;
import com.thalesssribeiro.soulslike_sp.dto.ItemsResponseDTO;
import com.thalesssribeiro.soulslike_sp.service.ItemsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class itemsController {

    private final ItemsService itemsService;
    @PostMapping
    public ItemsResponseDTO createItems(@RequestBody ItemsRequestDTO itemsRequestDTO){
        return itemsService.createNewItems(itemsRequestDTO);
    }
}
