package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Utente;
import com.example.demo.model.Viaggio;
import com.example.demo.servcie.ViaggioService;

@RestController
@RequestMapping("/viaggio")
public class ViaggioController {
	@Autowired
	ViaggioService viaggioService;
	
	@PostMapping("/creaVolo/{id}")
	public Viaggio creaVolo(@RequestBody Viaggio v,@PathVariable Long id) {
		return viaggioService.crea(v, id);
	}

	@GetMapping("/viaggi/{utenteId}")
	public List<Viaggio> mostraViaggiDiUtente(@PathVariable Long utenteId) {
		return viaggioService.mostraViaggiDiUtente(utenteId);
	}
	@GetMapping("/utentiPerRange")
	public List<Viaggio> utentiPerRange
	(@RequestParam("dataPartenza") Date dataPartenza, @RequestParam("dataRitorno") Date dataRitorno) {
        return viaggioService.cercaPerRange(dataPartenza, dataRitorno);
    }

}
