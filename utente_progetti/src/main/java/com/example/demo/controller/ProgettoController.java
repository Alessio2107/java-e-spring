package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Progetto;
import com.example.demo.model.User;
import com.example.demo.service.ProgettoService;

@RestController
@RequestMapping("/proj")
public class ProgettoController {
	@Autowired
	ProgettoService ps;
	
	@GetMapping("/cercaPerNome")
	public Progetto cercaP(@RequestParam String name) {
		return ps.findByName(name).get(0);
	}
	@PostMapping("/creaP")
	public Progetto aggiiuntaP(@RequestBody Progetto p) {
		return ps.add(p);
	}
	@GetMapping("/progetti/utenti/{id}")
    public List<User> listaUtentiPartecipanti
    (@PathVariable Long id) {
        return ps.listaUtentiPartecipanti(id);
    }
	
	@GetMapping("/range")
	public List<Progetto> trova(@RequestParam Date dataInizio, @RequestParam Date dataFine){
		return ps.range(dataInizio,dataFine);
	}
	@GetMapping("/listU")
	public Progetto trovaId(@RequestParam Long id){
		return ps.findById(id);
	}
}
