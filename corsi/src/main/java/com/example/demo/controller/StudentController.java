package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	@PostMapping("/creaS")
	public Student aggiungiS(@RequestBody Student s) {
		return ss.add(s);
	}
	
	@GetMapping("/allS")
	public List<Student> vediAss(){
		return ss.getCourse();
		
	}
	@GetMapping("/count/{id}")
	public long vediid(@PathVariable Long id){
		return ss.mostraNumero(id);
	}
	

	

}
