package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Utente;
import com.example.demo.repository.UtenteRepository;

@Service
public class UtenteService {
	@Autowired
	UtenteRepository utenteRepository;

	public List<Utente> mostraUtenti() {
		// TODO Auto-generated method stub
		return utenteRepository.findAll();
	}

	public Utente creaUnUtente(Utente utente) {
		// TODO Auto-generated method stub
		return utenteRepository.save(utente);
	}

	public void eliminaUtente(String nome) {
		// TODO Auto-generated method stub
		Utente utentePerNome= utenteRepository.getReferenceByNome(nome);
		utenteRepository.delete(utentePerNome);
	}

}
