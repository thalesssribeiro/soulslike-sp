package com.thalesssribeiro.soulslike_sp.repository;

import com.thalesssribeiro.soulslike_sp.dbo.ItemsDBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepository extends JpaRepository <ItemsDBO, Long> {
}
