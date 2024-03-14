package com.example.demo.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Prodotto;

@Repository
public interface ProdottoRepository extends JpaRepository<Prodotto, Long>{

}
