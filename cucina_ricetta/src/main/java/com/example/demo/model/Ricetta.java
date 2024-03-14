package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Ricetta {
	private int id;
	private String ingredientePrincipale;
	//private List<Ingrediente> listaIng=new ArrayList<>();
	
	public Ricetta() {
		
	}

	public Ricetta(int id, String ingredientePrincipale) {
		super();
		this.id = id;
		this.ingredientePrincipale = ingredientePrincipale;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIngredientePrincipale() {
		return ingredientePrincipale;
	}

	public void setIngredientePrincipale(String ingredientePrincipale) {
		this.ingredientePrincipale = ingredientePrincipale;
	}
	

	
}
