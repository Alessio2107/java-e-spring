package com.example.demo.model;

import java.sql.Blob;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Blob fotoProfilo;
	private String nome,cognome,email,password;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	@JsonIgnore
	private Set<Recensione> recensioniDellUser;

	
}
