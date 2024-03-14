package com.example.demo.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Zoo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome, nomeStrada, tipoStrada;
	private int numCivico;
	private Long numeroDiTelefono;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id_citta")
	private Citta citta;
	
	@OneToMany(mappedBy="zoo")
	Set<Animale> listaDegliAnimali;
	
	@OneToMany(mappedBy="zoo")
	Set<Recinto> listaDeiRecinti;

	public Zoo() {
		super();
	}

	public Zoo(Long id, String nome, String nomeStrada, String tipoStrada, int numCivico, Long numeroDiTelefono,
			Citta citta, Set<Animale> listaDegliAnimali, Set<Recinto> listaDeiRecinti) {
		super();
		this.id = id;
		this.nome = nome;
		this.nomeStrada = nomeStrada;
		this.tipoStrada = tipoStrada;
		this.numCivico = numCivico;
		this.numeroDiTelefono = numeroDiTelefono;
		this.citta = citta;
		this.listaDegliAnimali = listaDegliAnimali;
		this.listaDeiRecinti = listaDeiRecinti;
	}

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

	public String getNomeStrada() {
		return nomeStrada;
	}

	public void setNomeStrada(String nomeStrada) {
		this.nomeStrada = nomeStrada;
	}

	public String getTipoStrada() {
		return tipoStrada;
	}

	public void setTipoStrada(String tipoStrada) {
		this.tipoStrada = tipoStrada;
	}

	public int getNumCivico() {
		return numCivico;
	}

	public void setNumCivico(int numCivico) {
		this.numCivico = numCivico;
	}

	public Long getNumeroDiTelefono() {
		return numeroDiTelefono;
	}

	public void setNumeroDiTelefono(Long numeroDiTelefono) {
		this.numeroDiTelefono = numeroDiTelefono;
	}

	public Citta getCitta() {
		return citta;
	}

	public void setCitta(Citta citta) {
		this.citta = citta;
	}

	public Set<Animale> getListaDegliAnimali() {
		return listaDegliAnimali;
	}

	public void setListaDegliAnimali(Set<Animale> listaDegliAnimali) {
		this.listaDegliAnimali = listaDegliAnimali;
	}

	public Set<Recinto> getListaDeiRecinti() {
		return listaDeiRecinti;
	}

	public void setListaDeiRecinti(Set<Recinto> listaDeiRecinti) {
		this.listaDeiRecinti = listaDeiRecinti;
	}
	
	
	
	
	
	
	

}
