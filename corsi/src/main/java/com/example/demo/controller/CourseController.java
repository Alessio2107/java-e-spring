package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Course;
import com.example.demo.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	CourseService cs;
	
	@PostMapping("/creaC")
	public Course aggiungiC(@RequestBody Course c) {
		return cs.add(c);
	}
		
	@PutMapping("/associa/{studentId}/{courseId}")
	public Course corsiAssociati(@PathVariable Long studentId,
			@PathVariable Long courseId) {
		return cs.mostraCorsi(studentId, courseId);
	}

	
}
