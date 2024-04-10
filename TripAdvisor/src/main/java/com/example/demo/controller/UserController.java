package com.example.demo.controller;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@CrossOrigin
@RestController
@RequestMapping("api/usercontroller")
public class UserController {
	@Autowired
	UserService userService;

//	@PostMapping("/creaUtente")
//	public User creaUser(@RequestBody User user) {
//		return userService.crea(user);
//	}
//	@GetMapping("/decriptaPasswordDi/{id}")
//	public String decriptaPasswordDi(@PathVariable Long id) {
//		return userService.decript(id);
//	}
	
	//_________________________________________________________________________________
	
//	@PostMapping("/creaUtente")
//	public User registraUtente(@RequestBody User user) throws NoSuchAlgorithmException {
//		return userService.creau(user);
//	}
//	@GetMapping("/login")
//	public User log(String email, String password) throws NoSuchAlgorithmException {
//		return userService.Login(email, password);
//	}
	
	
	//____________________________________________________________________________
	
	
	@PostMapping("/registraUtenteConPasswordCriptata")
    public User registraUtenteConPasswordCriptata(@RequestBody User user) {
        return userService.creaUtenteConPasswordCriptata(user);
    }

    
    @PostMapping("/loginConVerificaPassword")
    public boolean loginConVerificaPassword(@RequestBody User user) {
        return userService.verificaLoginConBCrypt(user.getEmail(), user.getPassword());
    }

}	
	