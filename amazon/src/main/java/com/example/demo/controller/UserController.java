package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/u")
public class UserController {
	@Autowired
	UserService us;
	
	@GetMapping("/getUser")
	public Page<User> getUsers(@RequestParam
			(defaultValue="0") int page,
			@RequestParam(defaultValue="3") int size){
		return us.getU(PageRequest.of(page, size));
	}
	@PostMapping("/ins")
	public User ins(@RequestBody User u) {
		return us.aggiungi(u);
	}

}
