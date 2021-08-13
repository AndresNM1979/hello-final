package com.viewnext.hellofinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloFinalApplication.class, args);
	}
	@GetMapping("/")
	public String root(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/despedida")
	public String despedida() {
		return "Esta es la practica de finalizacion del curso, hasta pronto compañeros";
	}
}