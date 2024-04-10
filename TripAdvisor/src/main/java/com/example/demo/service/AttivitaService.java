package com.example.demo.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Attivita;
import com.example.demo.repository.AttivitaRepository;

@Service
public class AttivitaService {
	@Autowired
	AttivitaRepository attivitaRepository;

	public Attivita crea(Attivita attivita) {
		// TODO Auto-generated method stub
		return attivitaRepository.save(attivita);
	}

	public List<Attivita> mostra() {
		// TODO Auto-generated method stub
		return attivitaRepository.findAll();
	}

}
