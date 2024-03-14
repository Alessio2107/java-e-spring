package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Animale {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String specie,nome;
	private int eta;
	private double peso;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id_zoo")
	private Zoo zoo;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id_recinto")
	private Recinto recinto;

	public Animale() {
		super();
	}

	public Animale(Long id, String specie, String nome, int eta, double peso, Zoo zoo, Recinto recinto) {
		super();
		this.id = id;
		this.specie = specie;
		this.nome = nome;
		this.eta = eta;
		this.peso = peso;
		this.zoo = zoo;
		this.recinto = recinto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Zoo getZoo() {
		return zoo;
	}

	public void setZoo(Zoo zoo) {
		this.zoo = zoo;
	}

	public Recinto getRecinto() {
		return recinto;
	}

	public void setRecinto(Recinto recinto) {
		this.recinto = recinto;
	}
	
	
}
