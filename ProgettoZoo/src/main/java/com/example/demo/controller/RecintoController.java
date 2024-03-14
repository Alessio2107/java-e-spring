package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.RecintoService;


@RestController
@RequestMapping("/recinto")
public class RecintoController {
	@Autowired
	RecintoService rs;

}
