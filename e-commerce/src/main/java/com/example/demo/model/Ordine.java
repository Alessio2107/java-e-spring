package com.example.demo.model;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Ordine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String data;
	private String latitudine;
	private String longitudine;
	
	@OneToMany(mappedBy = "ordine")
	private List<Prodotto_Ordine> listaprodottoordine;	
	
	@ManyToOne
	@JoinColumn(name = "utente_id")
	private Utente utente;
	
	@ManyToOne
	@JoinColumn(name = "stato_id")
	private Stato stato;
	
	public List<Prodotto_Ordine> getListaprodottoordine() {
		return listaprodottoordine;
	}
	public void setListaprodottoordine(List<Prodotto_Ordine> listaprodottoordine) {
		this.listaprodottoordine = listaprodottoordine;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public Stato getStato() {
		return stato;
	}
	public void setStato(Stato stato) {
		this.stato = stato;
	}
	public Ordine() {
		super();
	}
	public String getLatitudine() {
		return latitudine;
	}
	public void setLatitudine(String latitudine) {
		this.latitudine = latitudine;
	}
	public String getLongitudine() {
		return longitudine;
	}
	public void setLongitudine(String longitudine) {
		this.longitudine = longitudine;
	}

}
