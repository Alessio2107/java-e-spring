package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.VisitaService;

@CrossOrigin
@RestController
@RequestMapping("api/visita")
public class VisitaController {
	@Autowired
	VisitaService visitaService;
}
