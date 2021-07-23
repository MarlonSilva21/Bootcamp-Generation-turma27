package com.hello2.hello2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")
public class HelloController {
	
	@GetMapping
	public String objetivosAprendizagem() {
		
		return "Nesta semana meus objetivos de aprendizagem eram: \n\n"
				
				
				+ "- Aprender sobre Banco de dados que foi algo passado em sala de aula onde vimos os conceitos de db relacional"
				+ " e não relacional.\n\n"
				+ "- Poder fixar melhor sobre os verbos do protocolo HTTP: Get, Post, Put e Delete e seus códigos de estado 2xx, 4xx e 5xx.\n\n"
				+ "- Aprender sobre Spring Boot pra pode entender melhor como que funciona esse Framework.";
				
	}

}
