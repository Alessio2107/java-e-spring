package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository ur;

	public Page<User> getU(PageRequest pageable) {
		// TODO Auto-generated method stub
		return ur.findAll(pageable);
	}

	public User aggiungi(User u) {
		// TODO Auto-generated method stub
		return ur.save(u);
	}
	
}
