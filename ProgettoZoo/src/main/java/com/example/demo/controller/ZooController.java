package com.example.demo.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Animale;
import com.example.demo.model.Zoo;
import com.example.demo.service.ZooService;


@RestController
@RequestMapping("/zoo")
public class ZooController {
	@Autowired
	ZooService zs;
	
	@GetMapping("/trovaPerCitta/{citta}")
	public Set<Zoo> mostraGliZoo(@PathVariable String citta){
		return zs.trovaPerCitta(citta);
	}
	
	@GetMapping("/infoZooPerId/{id}")
	public Zoo infoZooPerCitta(@PathVariable Long id) {
		return zs.infoDi(id);
	}
	@GetMapping("/aniamliDiZoo/{id}")
	public Set<Animale> aniamaliPresenti(@PathVariable Long id){
		return zs.elencaAnimaliDi(id);
	}
	@GetMapping("/zooPerSpecie/{specie}")
	public Zoo animaliPerzoo(@PathVariable String specie) {
		return zs.inQualeZooQuestaSpecie(specie);
	}

}
