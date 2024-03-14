package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.StudentRepository;

@Service
public class CourseService {

	@Autowired
	CourseRepository cr;
	@Autowired 
	StudentRepository sr;
	
	public Course add(Course c) {
		// TODO Auto-generated method stub
		return cr.save(c);
	}

	public Course mostraCorsi(Long studentId, Long courseId) {
		// TODO Auto-generated method stub
		Student s= sr.findById(studentId).get();
		Course c=cr.findById(courseId).get();
		c.getStudents().add(s);
		return cr.save(c);
		
		
		
	}

	

}
