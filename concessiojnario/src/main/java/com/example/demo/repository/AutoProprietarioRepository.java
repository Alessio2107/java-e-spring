package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Auto;
import com.example.demo.model.Auto_Proprietario;
import com.example.demo.model.Auto_Proprietario_Key;
import com.example.demo.model.Proprietario;

@Repository
public interface AutoProprietarioRepository extends JpaRepository<Auto_Proprietario, Auto_Proprietario_Key>{

//	Auto findAllAutoByAutoProprietario = null;
	
	@Query(value="SELECT * FROM `auto` WHERE id not in (SELECT auto_id FROM auto_proprietario)"
			, nativeQuery=true)
	Auto findDisponibiliAuto();

	//List<Auto> findAutoByAnno(int anno);

	List<Auto_Proprietario> findAllByAnno(int anno);

//	List<Proprietario> findProprietarioByAutoId(Long auto_id);

//	List<Proprietario> findByAutoId(Long auto_id);

//	List<Auto_Proprietario> findIdByAutoId(Long auto_id);

//	List<Auto_Proprietario> findAutoIdByAutoId(Long auto_id);

//	List<Auto_Proprietario> findAutoByAutoId(Long auto_id);

//	List<Auto_Proprietario> findAutoByA(Long auto_id);

//	List<Auto_Proprietario> findAutoByA(Auto a);

//	List<Auto_Proprietario> findAutoByAuto(Auto a);

	List<Auto_Proprietario> findA0ByA0(Auto a);

	List<Auto_Proprietario> findByP0Nome(String nome);

	List<Auto_Proprietario> findByA0(Auto auto);

//	Auto_Proprietario findProprietarioByAutoId(Long auto_id);

//	Proprietario findAllByAutoId(Long auto_id);

//	Proprietario findProprietarioByA0(Long auto_id);                                      

//	Proprietario findByA0(Long auto_id);

	

}
