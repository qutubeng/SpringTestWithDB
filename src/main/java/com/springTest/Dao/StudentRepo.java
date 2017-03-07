package com.springTest.Dao;


import java.util.Collection;

import org.springframework.data.repository.Repository;

import com.springTest.Entity.Student;

public interface StudentRepo extends Repository<Student, Integer> {
	Collection<Student> findAll();
	
	Student findById(int id);
	
	Student findByName(String name);
	
	Student save(Student student);
	
	Student delete(int id);
	
	int count(); 
	
	Collection<Student> findByCourse(String course);
}
