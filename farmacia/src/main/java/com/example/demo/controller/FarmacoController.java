package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Farmaco;
import com.example.demo.model.Risultato;
import com.example.demo.service.FarmacoService;

@RestController
@RequestMapping("/farm")
public class FarmacoController {
	@Autowired
	FarmacoService fs;
	
	@PostMapping("/add")
	public Farmaco aggiungi(@RequestBody Farmaco f) {
		return fs.aggiungi(f);
	}
	
	@DeleteMapping("/delete/{id}")
	public void leva(@PathVariable Long id) {
		fs.deletebyid(id);
	}
	@GetMapping("/cerca/{id}")
	public Farmaco trova(@PathVariable Long id) {
		return fs.findById(id);
	}
	@PutMapping("/aggiornaInfo/{id}")
	public Farmaco aggiornaInfo(@RequestBody Farmaco f2,@PathVariable Long id) {
		return fs.aggiornaLeInfo(f2, id);
	}
	@GetMapping("/farmaciPerPrescrizione")
	public Risultato farmaciPrescr(){
		return fs.trovabro();
	}
	
	

}
