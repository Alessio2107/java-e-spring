package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Farmaco {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	private String name,descrizione;
	private int costo;
	private boolean prescrivibile;
	public Farmaco() {
		
	}
	public Farmaco(Long id, String name, String descrizione, int costo, boolean prescrivibile) {
		super();
		this.id = id;
		this.name = name;
		this.descrizione = descrizione;
		this.costo = costo;
		this.prescrivibile = prescrivibile;
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
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	public boolean isPrescrivibile() {
		return prescrivibile;
	}
	public void setPrescrivibile(boolean prescrivibile) {
		this.prescrivibile = prescrivibile;
	}
	
	
	
	

}
