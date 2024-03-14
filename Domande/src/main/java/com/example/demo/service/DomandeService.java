package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Risposta;
import com.example.demo.model.Domanda;
import com.example.demo.repository.DomandeRepository;

@Service
public class DomandeService {
	@Autowired 
	DomandeRepository dr;

	public Domanda add(Risposta r, Long id) {
		// TODO Auto-generated method stub
		Domanda d= dr.findById(id).get();
		d.save(r.getRisposte());
		
		
	}

	public Domanda see(Long id) {
		// TODO Auto-generated method stub
		return dr.findById(id).get();
	}

	public void cancella(Long id) {
		// TODO Auto-generated method stub
		dr.deleteById(id);
	}

}
