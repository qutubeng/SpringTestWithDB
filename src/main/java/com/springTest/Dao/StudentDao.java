package com.springTest.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.springTest.Entity.Student;

@Repository
public class StudentDao {
	
	private static Map<Integer, Student> students;
	
	/*static {
		students = new HashMap<Integer, Student>() {
			{
				put(1, new Student(1, "Qutub", "Computer Science"));
				put(2, new Student(2, "Jewel", "Computer Science"));
				put(3, new Student(3, "Liza", "Finance"));
			}	
		};
	}*/
	
	public Collection<Student> getAllStudent() {
		return this.students.values();
	}
	
	public Student getStudentById(int id) {
		return this.students.get(id);
	}
}
