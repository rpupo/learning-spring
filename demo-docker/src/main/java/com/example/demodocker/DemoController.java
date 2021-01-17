package com.example.demodocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/greet/{name}")
	public String greeting(@PathVariable String name) {
            return "[inserted this]Pupo ----> HOLA........!!  " + name;
	}
	
	@GetMapping("/bonjour/{name}")
	public String bonjour(@PathVariable String name) {
            return "Pupo ----> Bonjour........!!  " + name;
	}



	@GetMapping("/salute/{name}")
	public String salute(@PathVariable String name) {
		return "[inserted this]Pupo ----> Salute........!!  " + name;
	}
}
