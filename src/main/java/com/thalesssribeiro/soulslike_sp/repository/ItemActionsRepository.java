package com.thalesssribeiro.soulslike_sp.repository;

import com.thalesssribeiro.soulslike_sp.dbo.ItemActionsDBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemActionsRepository extends JpaRepository<ItemActionsDBO, Long> {
}
