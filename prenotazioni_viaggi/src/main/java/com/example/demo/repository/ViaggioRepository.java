package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Viaggio;

@Repository
public interface ViaggioRepository extends JpaRepository<Viaggio, Long>{

	List<Viaggio> findByUtenteId(Long utenteId);

	List<Viaggio> findAllByDataPartenzaBetweenAndDataRitornoBetween(Date dataPartenza, Date dataRitorno);
}
