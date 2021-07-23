package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		
		return "Olá Generation, para a realização desta tarefa eu usei a mentalidade de persistência e "
			 + "a habilidade de atenção aos detalhes";
		
	}
	
}
