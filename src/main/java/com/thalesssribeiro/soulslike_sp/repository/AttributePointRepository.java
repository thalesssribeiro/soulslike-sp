package com.thalesssribeiro.soulslike_sp.repository;

import com.thalesssribeiro.soulslike_sp.dbo.AttributePointsDBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AttributePointRepository  extends JpaRepository <AttributePointsDBO, Long> {

    Optional<AttributePointsDBO> findByCharactersDBOId(Long characterID);
    Optional<AttributePointsDBO> findByCharactersDBOClazz(String characterClazz);
}
