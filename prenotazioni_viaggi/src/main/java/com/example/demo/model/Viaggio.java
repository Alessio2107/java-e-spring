package com.example.demo.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Viaggio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String partenza, destinazione;
	private Date dataPartenza,dataRitorno;
	private int durataViaggio,numeroDiPersone;
	
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id_utente")
	private Utente utente;
	
	
	public Viaggio() {
		
	}


	public Viaggio(Long id, String partenza, String destinazione, Date dataPartenza, Date dataRitorno,
			int durataViaggio, int numeroDiPersone, Utente utente) {
		super();
		this.id = id;
		this.partenza = partenza;
		this.destinazione = destinazione;
		this.dataPartenza = dataPartenza;
		this.dataRitorno = dataRitorno;
		this.durataViaggio = durataViaggio;
		this.numeroDiPersone = numeroDiPersone;
		this.utente = utente;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getPartenza() {
		return partenza;
	}


	public void setPartenza(String partenza) {
		this.partenza = partenza;
	}


	public String getDestinazione() {
		return destinazione;
	}


	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}


	public Date getDataPartenza() {
		return dataPartenza;
	}


	public void setDataPartenza(Date dataPartenza) {
		this.dataPartenza = dataPartenza;
	}


	public Date getDataRitorno() {
		return dataRitorno;
	}


	public void setDataRitorno(Date dataRitorno) {
		this.dataRitorno = dataRitorno;
	}


	public int getDurataViaggio() {
		return durataViaggio;
	}


	public void setDurataViaggio(int durataViaggio) {
		this.durataViaggio = durataViaggio;
	}


	public int getNumeroDiPersone() {
		return numeroDiPersone;
	}


	public void setNumeroDiPersone(int numeroDiPersone) {
		this.numeroDiPersone = numeroDiPersone;
	}


	public Utente getUtente() {
		return utente;
	}


	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	
	
}
