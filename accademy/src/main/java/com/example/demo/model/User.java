package com.example.demo.model;

public class User {
	private String nome,cognome;
	private int oreDiAssenza;
	public User() {
		
	}
	public User(String nome, String cognome, int oreDiAssenza) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.oreDiAssenza = oreDiAssenza;
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
	public int getOreDiAssenza() {
		return oreDiAssenza;
	}
	public void setOreDiAssenza(int oreDiAssenza) {
		this.oreDiAssenza = oreDiAssenza;
	}
	@Override
	public String toString() {
		return "User [nome=" + nome + ", cognome=" + cognome + ", oreDiAssenza=" + oreDiAssenza + "]";
	}
	
}
