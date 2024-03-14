package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Auto_Proprietario;
import com.example.demo.model.Proprietario;
import com.example.demo.service.AutoProprietarioService;

@RestController
@RequestMapping("/apc")
public class AutoProprietarioController {
	@Autowired
	AutoProprietarioService aps;
	
//	@GetMapping("/disponibili")
//	public Auto disponibilita(){
//		return aps.getQuelleSisp();
//	}
//	
	@GetMapping("/vendute/{anno}")
	public List<Auto_Proprietario> vendutePerAnno(@PathVariable int anno){
		return aps.getPerAnno(anno);
	}
	@GetMapping("/valoreAutoDi/{nome}")
	public int mostraValore(@PathVariable
			String nome){
		return aps.seeCostoOf(nome);
	}
	
	
	
}
