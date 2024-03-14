package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.example.demo.model.Utente;

@Service
public class UserService {
	
	public int aggiungiAnni(int anni) {
		// TODO Auto-generated method stub
		return anni+10;
	}

	public String mostraNome(String n) {
		// TODO Auto-generated method stub
		return n;
	}

	public List<Utente> filtraEta(List<Utente> lu) {
		// TODO Auto-generated method stub
		List<Utente> l= new ArrayList<>();
		
//		Utente u = new Utente("alessio", "ffr42f",20);
//		Utente u2 = new Utente("giacomo", "ffrwegterwf",30);
//		
//		l.add(u2);
//		l.add(u);
		l=lu.stream().filter(k->k.getAnni()>20)
				.collect(Collectors.toList());
		return l;
	}
	
}
