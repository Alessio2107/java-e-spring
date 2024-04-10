package com.example.demo.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Recensione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String nome,testo;
	@NonNull
	private double stella;
	@NonNull
	private Date data;
	
	
	@ManyToOne
	@JoinColumn(name="attivita_id")
	private Attivita attivita;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;


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


	public String getTesto() {
		return testo;
	}


	public void setTesto(String testo) {
		this.testo = testo;
	}


	public double getStella() {
		return stella;
	}


	public void setStella(double stella) {
		this.stella = stella;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public Attivita getAttivita() {
		return attivita;
	}


	public void setAttivita(Attivita attivita) {
		this.attivita = attivita;
	}
	
	
	

}
