package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Proprietario;
import com.example.demo.service.ProprietarioService;

@RestController
@RequestMapping("/ap")
public class ProprietarioController {
	@Autowired 
	ProprietarioService pss;
	
	@GetMapping("/infoDi/{auto_id}")
	public List<Proprietario> info(@PathVariable Long auto_id) {
		return pss.infoDI(auto_id);
	}
	
	@GetMapping("/infoPerModello/{modello}")
	public List<Proprietario> infoMarca(@PathVariable String modello){
		return pss.getinfo(modello);
	}
		
	
}
