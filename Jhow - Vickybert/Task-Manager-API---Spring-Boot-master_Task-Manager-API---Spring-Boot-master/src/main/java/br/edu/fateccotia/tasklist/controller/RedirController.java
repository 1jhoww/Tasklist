package br.edu.fateccotia.tasklist.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/short")
public class RedirController {
	
	@GetMapping("/id")
	public ResponseEntity<?>redir(@PathVariable(name = "key") String key){
		String url = switch(key) {
		case "qwe" -> "https://www.friv.com/";
		case "pqp" -> "https://www.clickjogos.com.br/";
		case "bla" -> "https://pt.wikipedia.org/wiki/Macaco";
		default -> "https://www.google.com";
		};
		return ResponseEntity.status(HttpStatus.FOUND).header("Location", url).build();
	}
 }

		
		
	

