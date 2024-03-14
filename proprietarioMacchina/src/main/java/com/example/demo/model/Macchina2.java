package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Macchina2{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true,nullable = false, length = 70)
	@NotNull
	private String targa;
	@NotNull
	private String modello,marca;
	@NotNull
	private int annoImmatricolazione;

	/*
	 * SELECT * FROM macchina;
	 * 
	 * SELECT * FROM proprietario;
	 * 
	 * SELECT * FROM macchina WHERE 
	 * anno_immatricolazione = 'anno';
	 * 
	 * SELECT * FROM macchina WHERE marca = 
	 * 'marca' AND modello = 'modello';
	 * 
	 * SELECT * FROM proprietario WHERE 
	 * cognome = 'cognome';
	 * 
	 * 
	 * 
	 * 
	 * SELECT * FROM cliente join ordini WHERE nazione = 'Italia' AND MONTH(DataOrdine) = 3;
	 * 
	 * 
	 * SELECT ROUND(AVG(prezzo)) FROM `prodotto`;
	 * 
	 * 
	 *----SELECT COUNT(prodotto.id) FROM Ordini WHERE ClienteID = '1' AND OrdineID = '1';
	 * 
	 * SELECT quantita FROM `dettaglioordine` WHERE idProdotto=1 and idOrdine=1;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */





}
