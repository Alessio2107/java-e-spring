package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class Risultato {
	List<Farmaco> listaFarmaci= new ArrayList<>();
	int prezzoTotale;
	public Risultato() {
		
	}
	public Risultato(List<Farmaco> listaFarmaci, int prezzoTotale) {
		super();
		this.listaFarmaci = listaFarmaci;
		this.prezzoTotale = prezzoTotale;
	}
	public List<Farmaco> getListaFarmaci() {
		return listaFarmaci;
	}
	public void setListaFarmaci(List<Farmaco> listaFarmaci) {
		this.listaFarmaci = listaFarmaci;
	}
	public int getPrezzoTotale() {
		return prezzoTotale;
	}
	public void setPrezzoTotale(int prezzoTotale) {
		this.prezzoTotale = prezzoTotale;
	}
	

}
