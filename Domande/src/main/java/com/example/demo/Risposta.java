package com.example.demo;

import java.util.List;

import com.example.demo.model.Domanda;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Risposta {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	private String risposta;
	private boolean giusta;
	@JsonIgnore
	List<Risposta> risposte;
	
	@ManyToOne
	@JoinColumn(name="id_domanda")
	private Domanda d;

	public Risposta() {
		
	}

	public Risposta(Long id, String risposta, boolean giusta, List<Risposta> risposte, Domanda d) {
		super();
		this.id = id;
		this.risposta = risposta;
		this.giusta = giusta;
		this.risposte = risposte;
		this.d = d;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRisposta() {
		return risposta;
	}

	public void setRisposta(String risposta) {
		this.risposta = risposta;
	}

	public boolean isGiusta() {
		return giusta;
	}

	public void setGiusta(boolean giusta) {
		this.giusta = giusta;
	}

	public List<Risposta> getRisposte() {
		return risposte;
	}

	public void setRisposte(List<Risposta> risposte) {
		this.risposte = risposte;
	}

	public Domanda getD() {
		return d;
	}

	public void setD(Domanda d) {
		this.d = d;
	}
	
}
