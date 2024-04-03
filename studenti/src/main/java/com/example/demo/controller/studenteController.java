package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Studente;
import com.example.demo.service.StudenteService;

@RestController
@RequestMapping("/studente")
public class studenteController {
	@Autowired
	StudenteService ss;

	@PostMapping("/crea")
	public Studente creaStudente(@RequestBody Studente s) {
		return ss.save(s);
	}

	@GetMapping("/tutti")
	public List<Studente> veditutti(){
		return ss.vedi();
	}
	@PutMapping("/up/{id}")
	public Studente aggiorna(@PathVariable Long id,
			@RequestBody Studente s) {
		return ss.agg(id, s);
	}
	@DeleteMapping("/del/{id}")
	public Studente delete(@PathVariable Long id) {
		return ss.rem(id);
	}
	@PatchMapping("/cambianome/{id}/{nome}")
	public Studente cambianome(@PathVariable Long id,
			@PathVariable String nome) {
		return ss.change(id,nome);
	}
	@GetMapping("/utenteperemail/{email}")
	public Studente trovaPerEmail(@PathVariable String email) {
		return ss.trovaem(email);
	}
	@GetMapping("/ordina")
	public List<Studente> vediperordine(){
		return ss.ordina();
	}
}
