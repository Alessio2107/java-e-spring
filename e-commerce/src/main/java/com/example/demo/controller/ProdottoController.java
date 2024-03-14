package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Prodotto;
import com.example.demo.service.ProdottoService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("api/prodotto")

public class ProdottoController {

	@Autowired
	ProdottoService prodottoService;

	@PostMapping("aggiungi")
	public Prodotto aggiungiProdotto(@RequestBody Prodotto prodotto) {		
		return prodottoService.aggiungiProdotto(prodotto);
	}
	

	@GetMapping("visualizza/{id}")
	public Prodotto visualizzaPerId(@PathVariable long id) {
		return prodottoService.visualizzaPerId(id);
	}
	
}
