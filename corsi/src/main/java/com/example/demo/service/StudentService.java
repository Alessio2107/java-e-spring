package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository sr;
	@Autowired
	CourseRepository cr;

	public Student add(Student s) {
		// TODO Auto-generated method stub
		return sr.save(s);
	}

	public Long mostraNumero(Long id) {  
		
		Course c=cr.findById(id).get();
		
		return sr.countFollowedCoursesGroupByFollowedCourses(c);
		
	}

	public List<Student> getCourse() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

//	public List<Student> getCourse() {
//		// TODO Auto-generated method stub
//		return ;
//	}
}
