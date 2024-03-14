package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Farmaco;

@Repository
public interface FarmacoRepository extends JpaRepository<Farmaco,Long>{

	void deleteById(Long id);

	Farmaco findFarmacoById(Long id);

}
