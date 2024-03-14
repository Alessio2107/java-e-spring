package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Farmaco;
import com.example.demo.model.Risultato;
import com.example.demo.repository.FarmacoRepository;

@Service
public class FarmacoService {
	@Autowired
	FarmacoRepository fr;

	public Farmaco aggiungi(Farmaco f) {
		// TODO Auto-generated method stub
		return fr.save(f);
	}

	public void deletebyid(Long id) {
		// TODO Auto-generated method stub
		fr.deleteById(id);
	}

	public Farmaco findById(Long id) {
		// TODO Auto-generated method stub
		return fr.findFarmacoById(id);
	}

	public Farmaco aggiornaLeInfo(Farmaco f2,Long id) {
		// TODO Auto-generated method stub
		Farmaco f=fr.findFarmacoById(id);
		f.setDescrizione(f2.getDescrizione());
		f.setCosto(f2.getCosto());
		f.setName(f2.getName());
		f.setPrescrivibile(f2.isPrescrivibile());
		fr.save(f);
		return f;
	}

	public Risultato trovabro() {
		Risultato r= new Risultato();
	    int sommaTotale = 0;
	    for (Farmaco f : fr.findAll()) {
	        if (f.isPrescrivibile()) {
	            sommaTotale += f.getCosto();
	            
	            
	        }else {
	        	r.getListaFarmaci().add(f);
	        }
	    }
	    r.setPrezzoTotale(sommaTotale);
	    
	    
	    return r;
	}

}
