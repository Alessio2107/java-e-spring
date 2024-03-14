package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Utente;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}

	@PostMapping("/eta")
	public int getAnni(@RequestBody Utente u) {
		return userService.aggiungiAnni(u.getAnni());
		
		
	}

	@PostMapping("/nome")
	public String getNome(@RequestBody Utente u) {
		return userService.mostraNome(u.getNome());
	}
	
	@GetMapping("/getEta/{anni}")
	public int mostraAnni(@PathVariable int anni) {
		
	    return userService.aggiungiAnni(anni);
	}
	@GetMapping("/piu20anni")
	public List<Utente> filtraEta(@RequestBody List<Utente> lu){
		return userService.filtraEta(lu);
	}
}
