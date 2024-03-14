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
public class Recinto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String identificatore,habitat;
	@OneToMany(mappedBy="recinto")
	Set<Animale> listaDegliAnimaliNelRecinto;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id_zoo")
	private Zoo zoo;

	public Recinto() {
		super();
	}

	public Recinto(Long id, String identificatore, String habitat, Set<Animale> listaDegliAnimaliNelRecinto, Zoo zoo) {
		super();
		this.id = id;
		this.identificatore = identificatore;
		this.habitat = habitat;
		this.listaDegliAnimaliNelRecinto = listaDegliAnimaliNelRecinto;
		this.zoo = zoo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentificatore() {
		return identificatore;
	}

	public void setIdentificatore(String identificatore) {
		this.identificatore = identificatore;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public Set<Animale> getListaDegliAnimaliNelRecinto() {
		return listaDegliAnimaliNelRecinto;
	}

	public void setListaDegliAnimaliNelRecinto(Set<Animale> listaDegliAnimaliNelRecinto) {
		this.listaDegliAnimaliNelRecinto = listaDegliAnimaliNelRecinto;
	}

	public Zoo getZoo() {
		return zoo;
	}

	public void setZoo(Zoo zoo) {
		this.zoo = zoo;
	}

	
	
	
	

}
