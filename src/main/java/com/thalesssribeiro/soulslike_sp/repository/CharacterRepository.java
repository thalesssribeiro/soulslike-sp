package com.thalesssribeiro.soulslike_sp.repository;


import com.thalesssribeiro.soulslike_sp.dbo.CharactersDBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository <CharactersDBO, Long> {


}
