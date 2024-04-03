package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService us;
	@PostMapping("/creaU")
	public User aggiunta(@RequestBody User u) {
		return us.add(u);
	}
	
	@GetMapping("/cercaPerSkill")
	public List<User> ricercaS(@RequestParam String skillCercata) {
		return us.ricercaPerSkill(skillCercata);
	}
	@GetMapping("/cercaPerCognome")
	public List<User> ricercaC(@RequestParam String cognomeCercato){
		return us.ricercaPerCognome(cognomeCercato);
	}

}
