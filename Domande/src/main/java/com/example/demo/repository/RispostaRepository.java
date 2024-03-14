package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Risposta;

@Repository
public interface RispostaRepository extends JpaRepository<Risposta, Long>{

	Risposta findByIdAndIsGiusta(boolean b);

}
