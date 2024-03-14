package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Zoo;



@Repository
public interface ZooRepository extends JpaRepository<Zoo, Long>{

}
