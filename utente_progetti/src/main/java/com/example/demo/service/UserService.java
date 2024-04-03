package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.ProgettoRepository;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository ur;
	@Autowired
	ProgettoRepository pr;

	public List<User> ricercaPerSkill(String skillCercata) {
        return ur.findBySkill(skillCercata);
    }
	public List<User> ricercaPerCognome(String cognome) {
        return ur.findByCognome(cognome);
    }
	public User add(User u) {
		// TODO Auto-generated method stub
		return ur.save(u);
	}
}
