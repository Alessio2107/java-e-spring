package com.example.demo.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Citta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeCitta;
	@OneToMany(mappedBy="citta")
	Set<Zoo> listaDegliZoo;
	public Citta() {
		super();
	}
	public Citta(Long id, String nomeCitta, Set<Zoo> listaDegliZoo) {
		super();
		this.id = id;
		this.nomeCitta = nomeCitta;
		this.listaDegliZoo = listaDegliZoo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeCitta() {
		return nomeCitta;
	}
	public void setNomeCitta(String nomeCitta) {
		this.nomeCitta = nomeCitta;
	}
	public Set<Zoo> getListaDegliZoo() {
		return listaDegliZoo;
	}
	public void setListaDegliZoo(Set<Zoo> listaDegliZoo) {
		this.listaDegliZoo = listaDegliZoo;
	}
	
	
	
	
	
	

}
