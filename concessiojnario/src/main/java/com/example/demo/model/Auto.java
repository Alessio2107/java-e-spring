package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Auto {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String targa;
	private String immatricolazione;
	private String modello;
	private String marca;
	private int costo;
	@JsonIgnore
	@OneToMany(mappedBy="a0")
	private List<Auto_Proprietario> autoP;
	
	public Auto() {
		
	}

	public Auto(Long id, String nome, String targa, String immatricolazione, String modello, String marca, int costo,
			List<Auto_Proprietario> autoP) {
		super();
		this.id = id;
		this.nome = nome;
		this.targa = targa;
		this.immatricolazione = immatricolazione;
		this.modello = modello;
		this.marca = marca;
		this.costo = costo;
		this.autoP = autoP;
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

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getImmatricolazione() {
		return immatricolazione;
	}

	public void setImmatricolazione(String immatricolazione) {
		this.immatricolazione = immatricolazione;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public List<Auto_Proprietario> getAutoP() {
		return autoP;
	}

	public void setAutoP(List<Auto_Proprietario> autoP) {
		this.autoP = autoP;
	}
	
	
	
	

}
