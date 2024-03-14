package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class UserService {
	private List<User> lista = new ArrayList<>();
	int media;
	
	
	public List<User> getLista() {
		return lista;
	}

	

	User u1= new User("Alessio","Salzillo",3);
	User u2= new User("Giacomo", "Rossi", 15);
	
	public void aggiunta() {
		lista.add(u1);
		lista.add(u2);
	}

	public void aggiungiUser(User u) {
		// TODO Auto-generated method stub
		
			aggiunta();
			getLista().add(u);
		
	}

	public List<User> mostra() {
		// TODO Auto-generated method stub
		return getLista();
	}

	public List<User> elimina(String n) {
		// TODO Auto-generated method stub
		getLista().removeIf(r ->
		r.getNome().equalsIgnoreCase(n));
		return getLista();
	    
	}

	public int mediaAll() {
		
		for (User u : getLista()) {
			media+=u.getOreDiAssenza();
		}
		media/=getLista().size();
		return media;
	}

	
}
