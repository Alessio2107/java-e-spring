package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Risposta;
import com.example.demo.model.Domanda;
import com.example.demo.repository.RispostaRepository;

@Service
public class RispostaService {
	@Autowired
	RispostaRepository rr;

	public Risposta update(Long id, Risposta r) {
		// TODO Auto-generated method stub
		Risposta r2=rr.getById(id);
		//r2.setD(r.getD());
		r2.setGiusta(r.isGiusta());
		r2.setRisposta(r.getRisposta());
		rr.save(r2);
		
		return r2;
	}

	public Risposta trovaGiusta(Long id, Domanda d) {
		// TODO Auto-generated method stub
		id=d.getId();                                           
		return rr.findByIdAndIsGiusta(true);
	}

}
