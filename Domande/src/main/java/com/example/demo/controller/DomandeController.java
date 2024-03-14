package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Risposta;
import com.example.demo.model.Domanda;
import com.example.demo.service.DomandeService;

@RestController
@RequestMapping("/ans")
public class DomandeController {
	@Autowired
	DomandeService ds;
	
	@PostMapping("/insert/{id}")
	public Domanda insert(@RequestBody Risposta r, 
			@PathVariable Long id){
		return ds.add(r,id);
	}
	@GetMapping("/vedi/{id}")
	public Domanda vedi(@PathVariable Long id) {
		return ds.see(id);
	}
	@DeleteMapping("del/{id}")
	public void delete(@PathVariable Long id) {
		ds.cancella(id);
	}

}
