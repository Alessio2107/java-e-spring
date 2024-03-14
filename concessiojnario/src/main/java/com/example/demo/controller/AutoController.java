package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Auto;
import com.example.demo.service.AutoService;

@RestController
@RequestMapping("/ap")
public class AutoController {
	@Autowired
	AutoService as;
	
	@GetMapping("/disponibili")
	public Auto disponibilita(){
		return as.getQuelleSisp();
	}
	@GetMapping("/costoInferioreA/{costoC}")
	public List<Auto> mostraCostoInferiore(@PathVariable int costoC){
		return as.getListaInferioreACostoC(costoC);
	}
}
