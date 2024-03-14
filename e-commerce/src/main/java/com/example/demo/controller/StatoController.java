package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Stato;
import com.example.demo.service.StatoService;

@RestController
@RequestMapping("api/stato")

public class StatoController {

	@Autowired
	StatoService statoService;
	
	@PostMapping("aggiungi")
	public Stato aggiungiStato(@RequestBody Stato stato) {		
		return statoService.aggiungiStato(stato);
	}
	
}
