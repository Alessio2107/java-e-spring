package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Elemento;
import com.example.demo.service.ElementoService;
@CrossOrigin
@RestController
@RequestMapping("/elementoController")
public class ElementoController {
	@Autowired
	ElementoService elementoService;
	
	@PostMapping("/creaElemento")
	public Elemento creaElemento(@RequestBody Elemento e) {
		return elementoService.crea(e);
	}
	
	@GetMapping("/mostraTuttiGliElementi")
	public List<Elemento> mostraTuttiGliElementi(){
		return elementoService.mostratutti();
	}
	@GetMapping("/trovaElementiPaginati/{dimensionePagina}/{pagina}")
    public Page<Elemento> trovaElementiPaginati(
            @PathVariable int pagina,
            @PathVariable(required = false) Integer dimensionePagina) {       
        int size = dimensionePagina != null ? dimensionePagina : 10; 
        
        
        return elementoService.trovaElementiConPaginazione(pagina, size);
    }
	
	@GetMapping("/trovaPerNome/{nome}")
	public Elemento trovaPerNome(@PathVariable String nome) {
		return elementoService.iteraPerNome(nome);
	}
	
	@PutMapping("/modificaElemento/{id}")
	public Elemento modificaElemento(@PathVariable Long id,
			@RequestBody Elemento e) {
		return elementoService.faiModifica(id, e);
	}
	
	@GetMapping("/getById/{id}")
		public Elemento getById(@PathVariable Long id) {
			return elementoService.getbyid(id);
		}
	
	@GetMapping("/getByNome/{nome}")
	public List<Elemento> getByNome(@PathVariable String nome){
		return elementoService.trovaPerNome(nome);
	}
	
	
}
