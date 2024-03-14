package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ordine;
import com.example.demo.model.Prodotto;
import com.example.demo.model.ProdottoOrdineKey;
import com.example.demo.model.Prodotto_Ordine;
import com.example.demo.repostiory.OrdineRepository;
import com.example.demo.repostiory.ProdottoRepository;
import com.example.demo.repostiory.Prodotto_OrdineRepository;

@Service
public class OrdineService {
	@Autowired
	OrdineRepository ordineRepository;
	@Autowired 
	Prodotto_OrdineRepository prodotto_OrdineRepository;
	@Autowired
	ProdottoRepository prodottoRepository;
	@Value("${deposito.lat}")
	private double lat;
	@Value("${deposito.lon}")
	private double lon;
	
	
	public void aggiungiOrdine(Ordine ordine) {
	    List<Prodotto_Ordine> listaProdottiOrdine = ordine.getListaprodottoordine();
	     ordineRepository.save(ordine);
	    for (Prodotto_Ordine prodottoOrdine : listaProdottiOrdine) {
	        Prodotto_Ordine nuovoProdottoOrdine = new Prodotto_Ordine();
	        ProdottoOrdineKey pok=new ProdottoOrdineKey();
	        Prodotto p=prodottoRepository.getReferenceById(prodottoOrdine.getProdottoOrdineKey().getProdottoId());
	        pok.setOrdineId(ordine.getId());
	        pok.setProdottoId(p.getId());
	        nuovoProdottoOrdine.setOrdine(ordine);
	        nuovoProdottoOrdine.setProdotto(p);
	        nuovoProdottoOrdine.setProdottoOrdineKey(pok);
	        nuovoProdottoOrdine.setQuantita(prodottoOrdine.getQuantita());
	        
	        prodotto_OrdineRepository.save(nuovoProdottoOrdine);
	    }
	  
	}


}
