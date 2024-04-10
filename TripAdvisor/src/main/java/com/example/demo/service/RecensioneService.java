package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Attivita;
import com.example.demo.model.Recensione;
import com.example.demo.repository.AttivitaRepository;
import com.example.demo.repository.RecensioneRepository;

@Service
public class RecensioneService {
	@Autowired
	RecensioneRepository recensioneRepository;
	@Autowired 
	AttivitaRepository attivitaR;
	

	public List<Recensione> mostra() {
		// TODO Auto-generated method stub
		return recensioneRepository.findAll();
	}

	public Recensione crea(Recensione recensione) {
		// TODO Auto-generated 
		Attivita attivita= attivitaR.getReferenceById(recensione.getAttivita().getId());
		recensione.setAttivita(attivita);
		return recensioneRepository.save(recensione);
	}

	public List<Recensione> trovaRecensioni(Long id) {
		// TODO Auto-generated method stub
		
		return recensioneRepository.findRecensioneByAttivitaId(id);
	}

	public int media() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void cancellaperid(Long id) {
		recensioneRepository.deleteById(id);
	}

	public List<Recensione> mostraperid(Long id) {
	    return recensioneRepository.findByAttivitaId(id);
	}

	public Recensione modifica(Long id,Recensione recensione) {
		// TODO Auto-generated method stub
		Recensione r= recensioneRepository.getReferenceById(id);
		r.setData(recensione.getData());
		r.setNome(recensione.getNome());
		r.setStella(recensione.getStella());
		r.setTesto(recensione.getTesto());
		r.setAttivita(recensione.getAttivita());
		return recensioneRepository.save(r);
	}


}
