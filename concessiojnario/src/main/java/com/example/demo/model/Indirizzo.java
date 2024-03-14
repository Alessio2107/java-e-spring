package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
@Embeddable
public class Indirizzo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String via;
	private String citta;
	private int cap;
	
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public int getCap() {
		return cap;
	}
	public void setCap(int cap) {
		this.cap = cap;
	}
	public static Long getSerialversionuid() {
		return serialVersionUID;
	}
	public Indirizzo(String via, String citta, int cap) {
		super();
		this.via = via;
		this.citta = citta;
		this.cap = cap;
	}
	public Indirizzo() {
		
	}
	
}
