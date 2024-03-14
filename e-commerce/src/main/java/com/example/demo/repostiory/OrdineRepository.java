package com.example.demo.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Ordine;

@Repository
public interface OrdineRepository extends JpaRepository<Ordine, Long>{

}
