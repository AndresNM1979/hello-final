package com.viewnext.hellofinal;


import org.codehaus.groovy.transform.tailrec.GotoRecurHereException
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class HelloFinalApplicationTests {

	static void main(String[] args) {
		SpringApplication.run(HelloFinalApplicationTests.class, args);
	}

	@GetMapping("/")
	public String root(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/Despedida")
	public String Despedida() {
		return "Esta es la practica de finalizacion del curso, hasta pronto compañeros";
	}
}
