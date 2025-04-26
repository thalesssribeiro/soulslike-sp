package com.thalesssribeiro.soulslike_sp;

import com.thalesssribeiro.soulslike_sp.dbo.CharactersDBO;
import com.thalesssribeiro.soulslike_sp.repository.CharacterRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.aot.AotServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class SoulslikeSpApplication {

	@Autowired
	private CharacterRepository characterRepository;
	public static void main(String[] args) {
		SpringApplication.run(SoulslikeSpApplication.class, args);
	}


}

