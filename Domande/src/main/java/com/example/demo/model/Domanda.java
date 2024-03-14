package com.example.demo.model;

import java.util.List;

import com.example.demo.Risposta;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Domanda {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	private String domanda;
	@OneToMany(mappedBy="domande")
	List<Risposta> risposte;
	public Domanda(Long id, String domanda, List<Risposta> risposte) {
		super();
		this.id = id;
		this.domanda = domanda;
		this.risposte = risposte;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDomanda() {
		return domanda;
	}
	public void setDomanda(String domanda) {
		this.domanda = domanda;
	}
	public List<Risposta> getRisposte() {
		return risposte;
	}
	public void setRisposte(List<Risposta> risposte) {
		this.risposte = risposte;
	}	
	
	
}
