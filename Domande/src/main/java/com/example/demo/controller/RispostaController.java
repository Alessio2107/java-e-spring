package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Risposta;
import com.example.demo.model.Domanda;
import com.example.demo.service.DomandeService;
import com.example.demo.service.RispostaService;

@RestController
@RequestMapping("/resp")
public class RispostaController {
	@Autowired
	RispostaService rs;
	@Autowired
	DomandeService ds;
	
	
	@PutMapping("/putRisposta/")
	public Risposta update(@RequestBody Risposta r, @PathVariable Long id) {
		return rs.update(id,r);
	}
	@GetMapping("/mostraLaGiusta/{id}")
	public Risposta giusta(@PathVariable Long id,Domanda d) {
		return rs.trovaGiusta(id,d);
	}
}
