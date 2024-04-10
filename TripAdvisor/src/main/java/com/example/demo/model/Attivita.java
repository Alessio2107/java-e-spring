package com.example.demo.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Attivita {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String nome,indirizzo;
	@NonNull
	private Long tel;
	@NonNull
	private String linkAMaps;
	
	@NonNull
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "attivita")
	@JsonIgnore
	private Set<Recensione> recensioni;


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


	public String getIndirizzo() {
		return indirizzo;
	}


	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}


	public Long getTel() {
		return tel;
	}


	public void setTel(Long tel) {
		this.tel = tel;
	}


	public Set<Recensione> getRecensioni() {
		return recensioni;
	}


	public void setRecensioni(Set<Recensione> recensioni) {
		this.recensioni = recensioni;
	}


	public String getLinkAMaps() {
		return linkAMaps;
	}


	public void setLinkAMaps(String linkAMaps) {
		this.linkAMaps = linkAMaps;
	}
	
	
}
