package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Utente;
import com.example.demo.service.UtenteService;

@RestController
@RequestMapping("/api/utente")
public class UtenteController {
	@Autowired
	UtenteService utenteService;
	
	@PostMapping("/creaUtente")
	public Utente creaUtente(@RequestParam("nome") String nome,
            @RequestParam("cognome") String cognome,
            @RequestParam("data") String data,
            @RequestParam("email") String email,
            @RequestParam("genere") String genere,
            @RequestParam("colorePreferito") String colorePreferito,
            @RequestParam("numeroDiTelefono") String numeroDiTelefono,
            @RequestParam("password") String password) {
		
		Utente u= new Utente();
		u.setNome(nome);
        u.setCognome(cognome);
        u.setEmail(email);
        u.setGenere(genere);
        
		return utenteService.crea(u);
	}

}
