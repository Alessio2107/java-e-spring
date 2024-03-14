package com.example.demo.model;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Utente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome,cognome,email;
	private int eta;

	@OneToMany(mappedBy="utente")
	List<Viaggio> listaDeiViaggi;

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

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	

	public List<Viaggio> getListaDeiViaggi() {
		return listaDeiViaggi;
	}

	public void setListaDeiViaggi(List<Viaggio> listaDeiViaggi) {
		this.listaDeiViaggi = listaDeiViaggi;
	}

	public Utente(Long id, String nome, String cognome, String email, int eta, List<Viaggio> listaDeiViaggi) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.eta = eta;
		this.listaDeiViaggi = listaDeiViaggi;
	}

	public Utente() {
		super();
	}
	
	

}
