package com.thalesssribeiro.soulslike_sp.service;

import com.thalesssribeiro.soulslike_sp.dbo.ItemActionsDBO;
import com.thalesssribeiro.soulslike_sp.dto.ItemActionsDTO;
import com.thalesssribeiro.soulslike_sp.repository.ItemActionsRepository;
import org.springframework.stereotype.Service;

@Service
public record ItemActionService(
        ItemActionsRepository itemActionsRepository,

        ItemsService itemsService
) {

    public void createItemsAction(Long itemId, ItemActionsDTO itemActionsDTO) {

        var itemsDBO = itemsService.findById(itemId);
        var itemActionDBO = new ItemActionsDBO(
                itemActionsDTO.isInfinite(),
                itemActionsDTO.isUsable(),
                itemActionsDTO.isDrop(),
                itemActionsDTO.action(),
                itemsDBO
        );

        itemActionsRepository.save(itemActionDBO);
    }

}
