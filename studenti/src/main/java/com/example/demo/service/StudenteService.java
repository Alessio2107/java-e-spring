package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Studente;
import com.example.demo.repository.StudenteR;
@Service
public class StudenteService {
	
	
	
	@Autowired
	StudenteR sr;

	public Studente save(Studente s) {
		// TODO Auto-generated method stub
		return sr.save(s);
	}

	public List<Studente> vedi() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	public Studente agg(Long id, Studente snew) {
		// TODO Auto-generated method stub
		Studente s=sr.getReferenceById(id);
		
		
		s.setName(snew.getName());
		s.setLastname(snew.getLastname());
		s.setEmail(snew.getEmail());
		return sr.save(s);
		
	}

	public Studente rem(Long id) {
		// TODO Auto-generated method stub
		Studente s2=sr.getReferenceById(id);
		sr.deleteById(id);
		return null;
	}

	public Studente change(Long id, String nome) {
		// TODO Auto-generated method stub
		Studente s2=sr.getReferenceById(id);
		s2.setName(nome);
		return sr.save(s2);
	}

	public Studente trovaem(String email) {
		// TODO Auto-generated method stub
		return sr.getReferenceByEmail(email);
		
	}

	public List<Studente> ordina() {
		// TODO Auto-generated method stub
		return sr.findAllByOrderByLastnameAsc();
		
	}
}

	

	
