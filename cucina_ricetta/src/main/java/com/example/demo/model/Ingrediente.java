package com.example.demo.model;

public class Ingrediente {
	private String nome;
	private int quantita;
	
	public Ingrediente() {
		
	}

	public Ingrediente(String nome, int quantita) {
		super();
		this.nome = nome;
		this.quantita = quantita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	
}
