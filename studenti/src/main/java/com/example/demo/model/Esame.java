package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity

public class Esame {
	private Long id;
	private String nome, descrizione;
	@OneToMany(mappedBy="studente_id")
	private Studente studente;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public Studente getStudente() {
		return studente;
	}
	public void setStudente(Studente studente) {
		this.studente = studente;
	}
	
}
