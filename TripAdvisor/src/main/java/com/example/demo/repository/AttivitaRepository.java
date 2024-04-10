package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Attivita;

@Repository
public interface AttivitaRepository extends JpaRepository<Attivita, Long>{

}
