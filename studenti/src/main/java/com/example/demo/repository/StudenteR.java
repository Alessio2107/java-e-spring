package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Studente;

@Repository
public interface StudenteR extends JpaRepository<Studente, Long>{

	Studente getReferenceByEmail(String email);

	List<Studente> findAllByOrderByLastnameAsc();

}
