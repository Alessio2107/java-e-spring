package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ordine;
import com.example.demo.model.Utente;
import com.example.demo.service.UtenteService;



@RestController
@RequestMapping("api/utente")

public class UtenteController{

	@Autowired
	UtenteService utenteService;
	
	@PostMapping("aggiungi")
	public Utente aggiungiUtente(@RequestBody Utente utente) {	
		return utenteService.aggiungiUtente(utente);	
	}
	
	@GetMapping("visualizza/{id}")
	public Utente visualizzaPerId(@PathVariable long id) {
		return  utenteService.visualizzaPerId(id);
	}
	
	@GetMapping("visualizzaordini/{id}")
	public List<Ordine> visualizzaOrdini(@PathVariable Long id) {
		return  utenteService.visualizzaOrdini(id);
	}
	
}
