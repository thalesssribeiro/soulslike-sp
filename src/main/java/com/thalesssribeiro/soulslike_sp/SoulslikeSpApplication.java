package com.thalesssribeiro.soulslike_sp;

import com.thalesssribeiro.soulslike_sp.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoulslikeSpApplication {

	@Autowired
	private CharacterRepository characterRepository;
	public static void main(String[] args) {
		SpringApplication.run(SoulslikeSpApplication.class, args);
	}


}

