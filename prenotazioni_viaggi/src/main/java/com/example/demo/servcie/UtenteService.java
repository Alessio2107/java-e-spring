package com.example.demo.servcie;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Utente;
import com.example.demo.model.Viaggio;
import com.example.demo.repository.UtenteRepository;

@Service
public class UtenteService {
	UtenteRepository utenteRepository;

	
	

	public Utente aggiungi(Viaggio v, Long i) {
		// TODO Auto-generated method stub
		
		return null;
		
	}

	public Utente crea(Utente u) {
		// TODO Auto-generated method stub
		return utenteRepository.save(u);
	}

	public List<Utente> findAll() {
		// TODO Auto-generated method stub
		return utenteRepository.findAll();
	}

	public void eliminaPerId(Long id) {
		// TODO Auto-generated method stub
		utenteRepository.deleteById(id);;
	}

	public List<Utente> UtentiPerDestinazione(String destinazione) {
		// TODO Auto-generated method stub
		return utenteRepository.findUtenteByViaggiDestinazione(destinazione);
	}

	public int contaPrenotazioni(Long id) {
		// TODO Auto-generated method stub
		Utente u=utenteRepository.getReferenceById(id);
		return u.getListaDeiViaggi().size();
		
	}

	

	
}
