package com.example.demo.metodi;

import java.util.Hashtable;
import java.util.Random;

public class UserMetodi {
	
	public String generaPasswordCriptata(String passwordNonCriptata) {
        int lunghezzaPassword = passwordNonCriptata.length();
        
        Hashtable<Integer, Character> hashtable = new Hashtable<>();
        Random random = new Random();
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lunghezzaPassword; i++) {
            char carattereCasuale = (char) (random.nextInt(26) + 'a'); 
            sb.append(carattereCasuale);
        }
        
        return sb.toString();
    }
	
//	public String decriptaPassword(String passwordCriptata) {
//		
//	}
}
