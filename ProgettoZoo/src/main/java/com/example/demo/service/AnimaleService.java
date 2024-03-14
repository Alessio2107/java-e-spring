package com.example.demo.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Animale;
import com.example.demo.model.Recinto;
import com.example.demo.repository.AnimaleRepository;
import com.example.demo.repository.RecintoRepository;



@Service
public class AnimaleService {
	@Autowired
	AnimaleRepository ar;
	@Autowired
	RecintoRepository rr;
	

	public Animale InfoDiAnimalePerId(Long id) {
		// TODO Auto-generated method stub
		
		return ar.findById(id).get();
	}


	public Set<Animale> mostraListaAnimali(Long id) {
		// TODO Auto-generated method stub
		Recinto r=rr.getReferenceById(id);
		return r.getListaDegliAnimaliNelRecinto();
		
	}
	

}
