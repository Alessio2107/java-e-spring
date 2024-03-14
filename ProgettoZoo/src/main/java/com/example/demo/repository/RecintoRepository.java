package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Recinto;



@Repository
public interface RecintoRepository extends JpaRepository<Recinto, Long>{

}
