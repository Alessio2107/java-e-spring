package com.example.demo.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
@Entity
public class Prodotto_Ordine {
	@EmbeddedId
	private ProdottoOrdineKey prodottoOrdineKey;
	
	private int quantita;
	
	@ManyToOne 	
	@JoinColumn(name = "prodotto_id")
	@MapsId("prodottoId")
	private Prodotto prodotto;
	
	@ManyToOne 	
	@JoinColumn(name = "ordine_id")
	@MapsId("ordineId")
	private Ordine ordine;

	public Prodotto_Ordine() {
		super();
	}

	public ProdottoOrdineKey getProdottoOrdineKey() {
		return prodottoOrdineKey;
	}

	public void setProdottoOrdineKey(ProdottoOrdineKey prodottoOrdineKey) {
		this.prodottoOrdineKey = prodottoOrdineKey;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public Prodotto getProdotto() {
		return prodotto;
	}

	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}

	public Ordine getOrdine() {
		return ordine;
	}

	public void setOrdine(Ordine ordine) {
		this.ordine = ordine;
	}
	
	
}
