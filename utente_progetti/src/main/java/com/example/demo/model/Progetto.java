package com.example.demo.model;

import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Progetto {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	private String name,descrizione,PL;
	private Date data;
	
	@ManyToMany(mappedBy = "progettiCv")
	Set<User> utenti;
	public Progetto() {
		
	}
	public Progetto(Long id, String name, String descrizione, String pL, Date data, Set<User> utenti) {
		super();
		this.id = id;
		this.name = name;
		this.descrizione = descrizione;
		PL = pL;
		this.data = data;
		this.utenti = utenti;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getPL() {
		return PL;
	}
	public void setPL(String pL) {
		PL = pL;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date dataProgetto) {
		this.data = dataProgetto;
	}
	public Set<User> getUtenti() {
		return utenti;
	}
	public void setUtenti(Set<User> utenti) {
		this.utenti = utenti;
	}
	
	
	

}
