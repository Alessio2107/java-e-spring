package com.example.demo.servcie;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Utente;
import com.example.demo.model.Viaggio;
import com.example.demo.repository.UtenteRepository;
import com.example.demo.repository.ViaggioRepository;

@Service
public class ViaggioService {
	@Autowired
	ViaggioRepository viaggioRepository;
	
	@Autowired
	UtenteRepository utenteRepository;

	 public List<Viaggio> mostraViaggiDiUtente(Long utenteId) {
	        return viaggioRepository.findByUtenteId(utenteId);
	    }

	public Viaggio crea(Viaggio v,Long id) {
		// TODO Auto-generated method stub
		Utente u=utenteRepository.getReferenceById(id);
		v.setUtente(u);
		u.getListaDeiViaggi().add(v);
		utenteRepository.save(u);
		return viaggioRepository.save(v);
	}

	public int contaPrenotazioni(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Viaggio> cercaPerRange(Date dataPartenza, Date dataRitorno) {
		// TODO Auto-generated method stub
		return viaggioRepository.findAllByDataPartenzaBetweenAndDataRitornoBetween(dataPartenza, dataRitorno);
	}

}
