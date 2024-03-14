package com.example.demo.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Animale;
import com.example.demo.service.AnimaleService;

@RestController
@RequestMapping("/animale")
public class AnimaleController {
	@Autowired
	AnimaleService as;

	@GetMapping("/infoDiAnimale/{id}")
	public Animale infoDi(@PathVariable Long id) {
		return as.InfoDiAnimalePerId(id);
	}
	@GetMapping("/animaliInIdRecinto/{id}")
	public Set<Animale> listaNelRecinto(@PathVariable Long id){
		return as.mostraListaAnimali(id);
	}
}
