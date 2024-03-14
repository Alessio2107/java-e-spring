package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ricetta;
import com.example.demo.service.RicettaService;

@RestController
@RequestMapping("/ricetta")
public class RicettaController {

    @Autowired
    RicettaService rs;
    
    @PostMapping("/aggiungi")
    public void aggiungi(@RequestBody Ricetta r) {
    	//System.out.print("sono qui");
    	rs.aggiungiRicetta(r);
    	
    }
    
    @GetMapping("/vediTutto")
    public List<Ricetta> vediTutto() {
        return rs.mostraTutto();
    }
    
    @DeleteMapping("/cancella/{id}")
    public List<Ricetta> cancella(@PathVariable int id) {
        return rs.eliminaByIngredientePrincipale(id);
    }

    @GetMapping("/cercaIng/{id}")
    public List<Ricetta> findbyIngrediente(@PathVariable String id) {
        return rs.cerca(id);
    }
}
