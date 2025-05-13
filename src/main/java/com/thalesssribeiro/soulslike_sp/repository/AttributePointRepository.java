package com.thalesssribeiro.soulslike_sp.repository;

import com.thalesssribeiro.soulslike_sp.dbo.AttributePointsDBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributePointRepository  extends JpaRepository <AttributePointsDBO, Long> {
}
