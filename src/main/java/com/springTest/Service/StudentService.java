package com.springTest.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springTest.Dao.StudentDao;
import com.springTest.Entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	public Collection<Student> getAllStudents() {
		return studentDao.getAllStudent();
	}
	
	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
	}
}
