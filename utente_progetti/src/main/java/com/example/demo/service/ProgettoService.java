package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Progetto;
import com.example.demo.model.User;
import com.example.demo.repository.ProgettoRepository;

@Service
public class ProgettoService {
	@Autowired
	ProgettoRepository pr;

	public List<Progetto> findByName(String name) {
		// TODO Auto-generated method stub
		return pr.findByName(name);
	}

	public Progetto add(Progetto p) {
		// TODO Auto-generated method stub
		return pr.save(p);
	}

	public List<User> listaUtentiPartecipanti(Long id) {
        return pr.findUtentiPartecipantiById(id);
    }

	public List<Progetto> range(Date dataInizio, Date dataFine) {
		// TODO Auto-generated method stub
		return pr.findByDataBetween(dataInizio, dataFine);
	}

	public Progetto findById(Long id) {
		// TODO Auto-generated method stub
		return pr.getReferenceById(id);
	}

}
