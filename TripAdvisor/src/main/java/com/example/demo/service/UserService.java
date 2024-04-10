package com.example.demo.service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.metodi.UserMetodi;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
	
	
	
	UserMetodi metodi=new UserMetodi();
	
	String passwordCriptata;
	String passwordNonCriptata;
		

	public User crea(User user) {
        String passwordNonCriptata = user.getPassword();
        String passwordCriptata = metodi.generaPasswordCriptata(passwordNonCriptata);
        user.setPassword(passwordCriptata);
        return userRepository.save(user);
    }


	public String decript(Long id) {
		// TODO Auto-generated method stub
		
		return passwordNonCriptata;
	}


	public User creau(User user) throws NoSuchAlgorithmException {
		
			 
			   String password = user.getPassword();
		        MessageDigest md = MessageDigest.getInstance("MD5");
		        byte[] messageDigest = md.digest(password.getBytes());
		        BigInteger no = new BigInteger(1, messageDigest);
		        String hashtext = no.toString(16);
		        while (hashtext.length() < 32) {
		            hashtext = "0" + hashtext;
		        }
		        user.setPassword(hashtext);
		       return userRepository.save(user);
		    }
	 
		public User Login(String email, String password) throws NoSuchAlgorithmException {
		
			 	
		        MessageDigest md = MessageDigest.getInstance("MD5");
		        byte[] messageDigest = md.digest(password.getBytes());
		        BigInteger no = new BigInteger(1, messageDigest);
		        String hashtext = no.toString(16);
		        while (hashtext.length() < 32) {
		            hashtext = "0" + hashtext;
		        }
		        User utente = userRepository.findByEmailAndPassword(email,hashtext);
				return utente;
		       
		    
	}
		
		//______________________________________________________________________________
		
		public User creaUtenteConPasswordCriptata(User user) {
	        String passwordOriginale = user.getPassword();
	        String passwordCriptata = bCryptPasswordEncoder.encode(passwordOriginale);
	        user.setPassword(passwordCriptata);
	        return userRepository.save(user);
	    }
	    
	    
	    public boolean verificaLoginConBCrypt(String email, String password) {
	        User utente = userRepository.findByEmail(email); 
	        if (utente != null) {
	            return bCryptPasswordEncoder.matches(password, utente.getPassword());
	        }
	        return false;
	    }


}
