package com.example.demo.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Animale;
import com.example.demo.model.Citta;
import com.example.demo.model.Zoo;
import com.example.demo.repository.AnimaleRepository;
import com.example.demo.repository.CittaRepository;
import com.example.demo.repository.ZooRepository;



@Service
public class ZooService {
	@Autowired
	ZooRepository zr;
	@Autowired 
	CittaRepository cr;
	@Autowired 
	AnimaleRepository ar;

	public Set<Zoo> trovaPerCitta(String citta) {
		// TODO Auto-generated method stub
		Citta c= cr.getReferenceByNomeCitta(citta);
		return c.getListaDegliZoo();
	}

	public Zoo infoDi(Long id) {
		// TODO Auto-generated method stub
		return zr.findById(id).get();
	}

	public Set<Animale> elencaAnimaliDi(Long id) {
		// TODO Auto-generated method stub
		Zoo z= zr.getReferenceById(id);
		return z.getListaDegliAnimali();
		
	}

	public Zoo inQualeZooQuestaSpecie(String specie) {
		// TODO Auto-generated method stub
		
		return ar.findZooBySpecie(specie);
	}

}
