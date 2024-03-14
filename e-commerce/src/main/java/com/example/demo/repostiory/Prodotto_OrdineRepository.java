package com.example.demo.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ProdottoOrdineKey;
import com.example.demo.model.Prodotto_Ordine;

@Repository
public interface Prodotto_OrdineRepository extends JpaRepository<Prodotto_Ordine, ProdottoOrdineKey>{

}
