package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/acc")
public class UserController {

	@Autowired
	UserService us;
	
	@PostMapping("/aggiungi")
    public void aggiungi(@RequestBody User u) {
    	//System.out.print("sono qui");
    	us.aggiungiUser(u);
    	
    }
	
	@GetMapping("/vedi")
	public List<User> veditutto(){
		return us.mostra();
		
	}
	@DeleteMapping("/cancella/{nome}")
    public List<User> cancella(@PathVariable String nome) {
        return us.elimina(nome);
    }
	@GetMapping("/media")
	public int media() {
		return us.mediaAll();
	}
}
