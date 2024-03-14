package com.example.demo.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class Auto_Proprietario {
	@EmbeddedId
	private Auto_Proprietario_Key key;
	
	private int anno;
	
	@ManyToOne
	@JoinColumn(name="proprietario_id")
	@MapsId("proprietarioId")
	private Proprietario p0;
	
	@ManyToOne
	@JoinColumn(name="auto_id")
	@MapsId("autoId")
	private Auto a0;

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public Proprietario getP0() {
		return p0;
	}

	public void setP0(Proprietario p0) {
		this.p0 = p0;
	}

	public Auto getA0() {
		return a0;
	}

	public void setA0(Auto a0) {
		this.a0 = a0;
	}

	public Auto_Proprietario(int anno, Proprietario p0, Auto a0) {
		super();
		this.anno = anno;
		this.p0 = p0;
		this.a0 = a0;
	}

	public Auto_Proprietario() {
		super();
	}
	
	
}
