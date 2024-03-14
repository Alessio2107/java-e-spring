package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Auto;
import com.example.demo.repository.AutoRepository;

@Service
public class AutoService {
	@Autowired
	AutoRepository ar;

	public Auto getQuelleSisp() {
		// TODO Auto-generated method stub
		return ar.findDisponibiliAuto();
	}

	public List<Auto> getListaInferioreACostoC(int costoC) {
		// TODO Auto-generated method stub
		return ar.findByCostoLessThan(costoC);
	}
}
