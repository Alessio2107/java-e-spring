package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Proprietario {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cognome;
	private int telefono;
	
	@OneToMany(mappedBy="p0")
	@JsonIgnore

	private List<Auto_Proprietario> ap;
	
	@Embedded
	@AttributeOverrides
	({   @AttributeOverride( name = "via",
	column = @Column(name = "indirizzo_via")),  
		@AttributeOverride( name = "citta", 
		column = @Column(name = "indirizzo_citta")), 
		@AttributeOverride( name = "cap", column 
		= @Column(name = "indirizzo_cap")) })
	private Indirizzo i;

	public Proprietario() {
		super();
	}

	public Proprietario(Long id, String nome, String cognome, int telefono, List<Auto_Proprietario> ap, Indirizzo i) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
		this.ap = ap;
		this.i = i;
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

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public List<Auto_Proprietario> getAp() {
		return ap;
	}

	public void setAp(List<Auto_Proprietario> ap) {
		this.ap = ap;
	}

	public Indirizzo getI() {
		return i;
	}

	public void setI(Indirizzo i) {
		this.i = i;
	}
	

	
	
	
	
}
