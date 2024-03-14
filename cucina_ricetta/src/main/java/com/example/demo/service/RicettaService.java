package com.example.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.model.Ricetta;

@Service
public class RicettaService {
	private List<Ricetta> ricette =new ArrayList<>();
	Ricetta r= new Ricetta(1,"Latte");
	Ricetta r1= new Ricetta(2,"Zucchero");
	Ricetta r2= new Ricetta(3,"Miele");
	Ricetta r3=new Ricetta(4,"Cioccolato");
	
	public void aggiungi() {
		ricette.add(r);
		ricette.add(r1);
		ricette.add(r2);
		ricette.add(r3);
	}
	

	public List<Ricetta> getRicette() {
		return ricette;
	}


	


	public RicettaService() {
		this.ricette = new ArrayList<>();
	}


	public List<Ricetta> mostraTutto() {
		return getRicette();
	}


//	public List<Ricetta> elimina(Ricetta r) {
//		getRicette().removeIf(k->k.getIngredientePrincipale()
//				.equals(r.getIngredientePrincipale()));
//		return getRicette();
//	}
	
	
	/*
	 * default boolean removeIf(Predicate<? super E> filter) {
        Objects.requireNonNull(filter);
        boolean removed = false;
        final Iterator<E> each = iterator();
        while (each.hasNext()) {
            if (filter.test(each.next())) {
                each.remove();
                removed = true;
            }
        }
        return removed;
    }
	 */


	public List<Ricetta> cerca(String ingredientePrincipale) {
		return getRicette().stream()
	            .filter(k -> k.getIngredientePrincipale().equals(ingredientePrincipale))
	            .collect(Collectors.toList());
	    
	}


	public void aggiungiRicetta(Ricetta r) {
		// TODO Auto-generated method stub
		aggiungi();
		getRicette().add(r);
	}


	public List<Ricetta> eliminaByIngredientePrincipale(int id) {
	    getRicette().removeIf(r -> r.getId()==(id));
	    return getRicette();
	}



}
