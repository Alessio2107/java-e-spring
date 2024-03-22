package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Utente;
import com.example.demo.repository.UtenteRepository;
import com.example.demo.service.UtenteService;

@RestController
@RequestMapping("/api/utenteContoller")
public class UtenteController {
	
	@Autowired
	UtenteService utenteService;
	
	@GetMapping("/mostraTuttiGliUtenti")
	public List<Utente> mostraTuttiGliUtenti(){
		return utenteService.mostraUtenti();
	}
	
	@PostMapping("/creaUnUtente")
	public Utente creaUnUtente(@RequestBody Utente utente) {
		return utenteService.creaUnUtente(utente);
	}
	
	@DeleteMapping("/cancellaUtente/{nome}")
	public void cancellaUtente(@PathVariable String nome) {
		
		utenteService.eliminaUtente(nome);
	}
	

}
