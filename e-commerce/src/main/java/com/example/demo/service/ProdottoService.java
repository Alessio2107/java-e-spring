package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Prodotto;
import com.example.demo.repostiory.OrdineRepository;
import com.example.demo.repostiory.ProdottoRepository;

@Service
public class ProdottoService {
	@Autowired
	ProdottoRepository prodottoRepository;

	@Autowired
	OrdineRepository ordineRepository;
	
	public Prodotto aggiungiProdotto(Prodotto prodotto) {
		return prodottoRepository.save(prodotto);
	}

//	public void collegaOrdine(long id_ordine, long id_prodotto) {
//		Ordine o=ordineRepository.getReferenceById(id_ordine);
//		Prodotto p=prodottoRepository.getReferenceById(id_prodotto);
//		Set<Ordine> ordineUpdate=p.getOrdini();
//		Set<Prodotto> prodottoUpdate=o.getProdotti();
//		ordineUpdate.add(o);
//		prodottoUpdate.add(p);
//		ordineRepository.save(o);
//		prodottoRepository.save(p);
//		}

	public Prodotto visualizzaPerId(long id) {
		return prodottoRepository.findById(id).get();
	}
	
	
	
}
