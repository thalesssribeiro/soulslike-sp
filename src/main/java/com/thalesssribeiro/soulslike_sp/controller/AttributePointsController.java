package com.thalesssribeiro.soulslike_sp.controller;

import com.thalesssribeiro.soulslike_sp.dto.AttributePointsRequestDTO;
import com.thalesssribeiro.soulslike_sp.service.AttributePointsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/attribute-points")
@RequiredArgsConstructor

public class AttributePointsController {
    private final AttributePointsService attributePointsService;
    @PostMapping("/characters/{characterID}")
    public void createAttributePoints(@RequestBody AttributePointsRequestDTO attributePointsRequestDTO,
                                      @PathVariable("characterID") Long characterID){
        attributePointsService.createAttributePoints(characterID,attributePointsRequestDTO);
    }
}
