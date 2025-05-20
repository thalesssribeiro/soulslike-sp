package com.thalesssribeiro.soulslike_sp.controller;

import com.thalesssribeiro.soulslike_sp.dto.ItemActionsDTO;
import com.thalesssribeiro.soulslike_sp.service.ItemActionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item-actions")
@RequiredArgsConstructor
public class ItemActionsController {
    private final ItemActionService itemActionService;

    @PostMapping("/item/{itemID}")
    public void createItemActionPoints (@RequestBody ItemActionsDTO itemActionsDTO,
                                        @PathVariable("itemID") Long itemID){
        itemActionService.createItemsAction(itemID,itemActionsDTO);
    }
}
