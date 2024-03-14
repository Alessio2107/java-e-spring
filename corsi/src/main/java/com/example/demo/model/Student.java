package com.example.demo.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;
	private String firstName, lastName;
	private int age;
	
	@ManyToMany
	@JoinTable(name="courses", joinColumns= @JoinColumn
	(name="student_id"),inverseJoinColumns
	=@JoinColumn(name="course_id"))
	Set<Course> followedCourses;

	public Student() {
		
	}

	public Student(long id, String firstName, String lastName, int age, Set<Course> followedCourses) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.followedCourses = followedCourses;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Set<Course> getFollowedCourses() {
		return followedCourses;
	}

	public void setFollowedCourses(Set<Course> followedCourses) {
		this.followedCourses = followedCourses;
	}

	
	
}
