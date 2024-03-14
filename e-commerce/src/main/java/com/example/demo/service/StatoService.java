package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Stato;
import com.example.demo.repostiory.StatoRepository;

@Service
public class StatoService {
	@Autowired
	StatoRepository statoRepository;

	public Stato aggiungiStato(Stato stato) {
		return statoRepository.save(stato);
	}


}
