package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Animale;

@Repository
public interface AnimaleRepository extends JpaRepository<Animale, Long>{

}
