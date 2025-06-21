package com.thalesssribeiro.soulslike_sp.repository;

import com.thalesssribeiro.soulslike_sp.dbo.CharactersItemsDBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterItemsRepository extends JpaRepository <CharactersItemsDBO, Long> {

    List<CharactersItemsDBO> findAllByCharactersDBOId(Long characterID);
}
