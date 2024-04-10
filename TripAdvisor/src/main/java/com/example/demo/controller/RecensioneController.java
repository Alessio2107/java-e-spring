package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Recensione;
import com.example.demo.service.RecensioneService;

@CrossOrigin
@RestController
@RequestMapping("api/recensione")
public class RecensioneController {
	@Autowired
	RecensioneService recensioneService;
	
	@GetMapping("/mostraRecensioni")
	public List<Recensione> mostraRecensionePerAttivita(){
		return recensioneService.mostra();
	}
	@PostMapping("/creaRecensione")
	public Recensione creaRecensione(@RequestBody Recensione recensione) {
		return recensioneService.crea(recensione);
	}
	@GetMapping("/trovaRecensioniPerAttivita/{id}")
	public List<Recensione> trovaRecensioniPerAttivita(@PathVariable Long id){
		return recensioneService.trovaRecensioni(id);
	}
	@GetMapping("/mediaRecensioniPerAttivita/{id}")
	public int mediaRecensioniPerAttivita(@PathVariable Long id) {
		
		
		return recensioneService.media();
	}
	@DeleteMapping("/eliminaRecensionePerId/{id}")
	public void deleteperid(@PathVariable Long id) {
		recensioneService.cancellaperid(id);
	}
	@GetMapping("/mostraRecensionePerAttivitaId/{id}")
	public List<Recensione> mostraRecensionePerAttivitaId(
			@PathVariable Long id){
		return recensioneService.mostraperid(id);
	}
	@PutMapping("/modificaPerId/{id}")
	public Recensione modificaPerId(@PathVariable Long id, @RequestBody Recensione recensione) {
		return recensioneService.modifica(id,recensione);
	}
}
