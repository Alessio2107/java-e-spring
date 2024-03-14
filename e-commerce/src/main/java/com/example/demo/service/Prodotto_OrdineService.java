package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repostiory.Prodotto_OrdineRepository;

@Service
public class Prodotto_OrdineService {
	@Autowired
	Prodotto_OrdineRepository prodotto_OrdineRepository;
	
}
