package com.example.demo.repository;

//import java.util.Date;
import java.sql.*;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Progetto;
import com.example.demo.model.User;
@Repository
public interface ProgettoRepository extends JpaRepository<Progetto, Long>{

	List<Progetto> findByName(String name);

	 @Query("SELECT u FROM User u JOIN u.progettiCv p WHERE p.id = :progettoId")
	    List<User> findUtentiPartecipantiById(@Param("progettoId") Long progettoId);


	List<Progetto> findByDataBetween(java.util.Date dataInizio, java.util.Date dataFine);



	

}
