package com.thalesssribeiro.soulslike_sp.service;

import com.thalesssribeiro.soulslike_sp.dbo.ItemsDBO;
import com.thalesssribeiro.soulslike_sp.dto.ItemsRequestDTO;
import com.thalesssribeiro.soulslike_sp.dto.ItemsResponseDTO;
import com.thalesssribeiro.soulslike_sp.repository.ItemsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemsService {

    private final ItemsRepository itemsRepository;
    public ItemsResponseDTO createNewItems(ItemsRequestDTO itemsRequestDTO){

        var itemsSaved = itemsRepository.save(
                new ItemsDBO(
                        itemsRequestDTO.name(),
                        itemsRequestDTO.type()
                )
        );
        return new ItemsResponseDTO(itemsSaved.getId());
    }
}
