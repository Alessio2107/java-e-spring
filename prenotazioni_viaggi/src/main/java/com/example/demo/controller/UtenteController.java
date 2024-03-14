package com.example.demo.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Utente;
import com.example.demo.model.Viaggio;
import com.example.demo.servcie.UtenteService;

@RestController
@RequestMapping("/utente")
public class UtenteController {
	@Autowired
	UtenteService utenteService;

	@PostMapping("/creaUtente")
	public Utente creaUtente(@RequestBody Utente u) {
		return utenteService.crea(u);
	}



	@PostMapping("/aggiungiPrenotazione/{id}")
	public Utente aggiungiPrenotazione(@RequestBody Viaggio v, @PathVariable Long id) {
		return utenteService.aggiungi(v,id);

	}
	@GetMapping
	public List<Utente> getAllUsers() {
		return utenteService.findAll();
	}
	@DeleteMapping("/cancellaUtente/{id}")
	public void eliminia(@PathVariable Long id) {
		utenteService.eliminaPerId(id);
	}
	@GetMapping("/utentiPerDestinazione")
	 public List<Utente> trovaPerDestinazione(@RequestParam("destination") String destinazione) {
        return utenteService.UtentiPerDestinazione(destinazione);
    }
	
	@GetMapping("/numeroDiPrenotazioniPer/{id}")
	public int numeroDiPrenotazioniPer(@PathVariable Long id) {
		return utenteService.contaPrenotazioni(id);
	}

}
