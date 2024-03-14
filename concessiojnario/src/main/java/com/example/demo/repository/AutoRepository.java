package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Auto;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Long>{

//	Auto findAutoByP0IsNull();

	//Auto findAutoByAutoProprietarioIsNull();
	
	@Query(value="SELECT * FROM `auto` WHERE id not in (SELECT auto_id FROM auto_proprietario)"
			, nativeQuery=true)
	Auto findDisponibiliAuto();

	

	List<Auto> findByCostoLessThan(int costoC);



	Auto findByModello(String modello);

	

}
