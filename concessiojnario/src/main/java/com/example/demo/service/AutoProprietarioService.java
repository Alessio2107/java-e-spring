package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Auto;
import com.example.demo.model.Auto_Proprietario;
import com.example.demo.model.Proprietario;
import com.example.demo.repository.AutoProprietarioRepository;
import com.example.demo.repository.ProprietarioRepository;

@Service
public class AutoProprietarioService {
	@Autowired
	AutoProprietarioRepository apr;
	
	@Autowired
	ProprietarioRepository prrr;
	
	

	public Auto getQuelleSisp() {
		// TODO Auto-generated method stub
		return apr.findDisponibiliAuto();
	}

	public List<Auto_Proprietario> getPerAnno(int anno) {
		// TODO Auto-generated method stub
		return apr.findAllByAnno(anno);
	}

	public int seeCostoOf(String nome) {
		// TODO Auto-generated method stub
		List<Auto_Proprietario> autoProprietari = apr.findByP0Nome(nome);
		int costoTotale=0;
		for (Auto_Proprietario a1 : autoProprietari) {
			costoTotale+=a1.getA0().getCosto();
		}
		return costoTotale;
	}

	
}
