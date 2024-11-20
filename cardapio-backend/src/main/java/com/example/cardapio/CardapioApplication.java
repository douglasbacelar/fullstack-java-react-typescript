package com.example.cardapio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardapioApplication {

	public static void main(String[] args) {

		System.out.println("Iniciando a aplicação Cardápio1...");
		SpringApplication.run(CardapioApplication.class, args);
		System.out.println("Aplicação Cardápio iniciada com sucesso!");

	}

}
