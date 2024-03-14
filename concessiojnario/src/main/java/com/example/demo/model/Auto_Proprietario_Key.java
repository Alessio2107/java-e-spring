package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Auto_Proprietario_Key implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="proprietario_id")
	private Long proprietarioId;
	
	@Column(name="auto_id")
	private Long autoId;

	public Auto_Proprietario_Key() {
		super();
	}

	public Auto_Proprietario_Key(Long proprietarioId, Long autoId) {
		super();
		this.proprietarioId = proprietarioId;
		this.autoId = autoId;
	}

	public Long getProprietarioId() {
		return proprietarioId;
	}

	public void setProprietarioId(Long proprietarioId) {
		this.proprietarioId = proprietarioId;
	}

	public Long getAutoId() {
		return autoId;
	}

	public void setAutoId(Long autoId) {
		this.autoId = autoId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	
	
	
	
}
