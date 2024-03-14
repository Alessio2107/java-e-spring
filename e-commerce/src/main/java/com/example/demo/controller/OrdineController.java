package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Ordine;
import com.example.demo.service.OrdineService;

@RestController
@RequestMapping("api/ordine")

public class OrdineController {

	@Autowired
	OrdineService ordineService;

	@PostMapping("aggiungi")
	public void aggiungiOrdine(@RequestBody Ordine ordine) {
		 ordineService.aggiungiOrdine(ordine);
	}
	
}
