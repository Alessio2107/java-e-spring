package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.model.Elemento;
import com.example.demo.repository.ElementoRepository;

@Service
public class ElementoService {
	@Autowired
	ElementoRepository elementoRepository;

	public Elemento crea(Elemento e) {
		// TODO Auto-generated method stub
		return elementoRepository.save(e);
	}

	public List<Elemento> mostratutti() {
		// TODO Auto-generated method stub
		return elementoRepository.findAll();
	}
	
	public Page<Elemento> trovaElementiConPaginazione(int numeroPagina, int dimensionePagina) {
        PageRequest pageRequest = PageRequest.of(numeroPagina, dimensionePagina);
        return elementoRepository.findAll(pageRequest);
    }

	public Elemento iteraPerNome(String nome) {
		
        return elementoRepository.findByNomeIgnoreCase(nome);
        
    }

	public Elemento faiModifica(Long id, Elemento e) {
		// TODO Auto-generated method stub
		Elemento el= elementoRepository.getReferenceById(id);
		el.setNome(e.getNome());
		el.setPeso(e.getPeso());
		el.setSigla(e.getSigla());
		elementoRepository.save(el);
		return el;
	}

	public Elemento getbyid(Long id) {
		// TODO Auto-generated method stub
		return elementoRepository.findById(id).get();
	}

	public List<Elemento> trovaPerNome(String nome) {
		// TODO Auto-generated method stub
		return elementoRepository.findAllByNome(nome);
	}
	
	

}
