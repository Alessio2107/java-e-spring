package com.example.demo.model;


public class Utente {
	private String nome,cognome;
	private int anni;
	public Utente() {
		
	}
	
	public Utente(String nome, String cognome, int anni) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.anni = anni;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getAnni() {
		return anni;
	}
	public void setAnni(int anni) {
		this.anni = anni;
	}
	
}
