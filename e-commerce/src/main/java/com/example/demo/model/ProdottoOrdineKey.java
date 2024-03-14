package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ProdottoOrdineKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "prodotto_id")
	private long prodottoId;
	
	@Column(name="ordine_id")
	private long ordineId;

	public long getProdottoId() {
		return prodottoId;
	}

	public void setProdottoId(long prodottoId) {
		this.prodottoId = prodottoId;
	}

	public long getOrdineId() {
		return ordineId;
	}

	public void setOrdineId(long ordineId) {
		this.ordineId = ordineId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ProdottoOrdineKey() {
		super();
	}

	
}
