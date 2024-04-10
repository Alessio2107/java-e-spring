package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Attivita;
import com.example.demo.service.AttivitaService;

@CrossOrigin
@RestController
@RequestMapping("api/attivita")
public class AttivitaController {
	@Autowired
	AttivitaService attivitaService;
	
	@PostMapping("/creaAttivita")
	public Attivita creaAttivita(@RequestBody Attivita attivita) {
		return attivitaService.crea(attivita);
	}
	@GetMapping("/mostraTutteLeAttivita")
	public List<Attivita> mostraTutteLeAttivita(){
		return attivitaService.mostra();
	}

}
