package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Auto_Proprietario;
import com.example.demo.model.Proprietario;

@Repository
public interface ProprietarioRepository extends JpaRepository<Proprietario, Long>{

	Proprietario getReferenceByNome(String nome);

//	Proprietario findAllByA0(Long auto_id);

//	Proprietario findAllByAutoId(Long auto_id);
//	List<Proprietario> findByA0Id(Long auto_id);

//	List<Proprietario> findProprietarioByAutoId(Long auto_id);

}
