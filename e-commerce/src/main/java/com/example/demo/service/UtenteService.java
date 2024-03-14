package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ordine;
import com.example.demo.model.Utente;
import com.example.demo.repostiory.UtenteRepository;

@Service
public class UtenteService {
	@Autowired
	UtenteRepository utenteRepository;

	public Utente aggiungiUtente(Utente utente) {
		return utenteRepository.save(utente);
	}

	public Utente visualizzaPerId(long id) {
		return utenteRepository.findById(id).get();
	}

	public List<Ordine> visualizzaOrdini(Long id) {
		Utente u=utenteRepository.findById(id).get();
		return u.getListaordine();
	}
	
	
	
	
	
}
