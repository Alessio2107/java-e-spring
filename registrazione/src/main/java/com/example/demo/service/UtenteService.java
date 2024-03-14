package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Utente;
import com.example.demo.repository.UtenteRepository;

@Service
public class UtenteService {
	@Autowired
	UtenteRepository utenteRepository;

	public Utente crea(Utente utente) {
		// TODO Auto-generated method stub
		return utenteRepository.save(utente);
	}

}
