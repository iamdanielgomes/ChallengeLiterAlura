package com.github.iamdanielgomes.literalura;

import com.github.iamdanielgomes.literalura.main.RunMain;
import com.github.iamdanielgomes.literalura.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

	@Autowired
	private LivroRepository service;
	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		RunMain menu = new RunMain(service);
		menu.exibeMenu();

	}
}
