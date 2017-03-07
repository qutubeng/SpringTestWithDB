package com.springTest.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springTest.Dao.StudentRepo;
import com.springTest.Entity.Student;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentRepo studentRepo;
	//private StudentService studentService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Student> getAllStudents() {		
		return studentRepo.findAll();
	}
	
	@RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int id) {
		return studentRepo.findById(id);
	}
	
	@RequestMapping(value = "/getByName/{name}", method = RequestMethod.GET)
	public Student getStudentByName(@PathVariable("name") String name) {
		return studentRepo.findByName(name);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void saveStudent(@RequestBody Student student) {
		studentRepo.save(student);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public void deleteStudent(@PathVariable("id") int id) {
		studentRepo.delete(id);
	}
	
	/*
	 * count total students
	 */
	@RequestMapping(value = "/count", method = RequestMethod.GET)
	public int countStudent() {
		return studentRepo.count();
	}
	
	/*
	 *Get student by course 
	 */
	@RequestMapping(value = "/getByCourse/{course}", method = RequestMethod.GET)
	public Collection<Student> getStudentByCourse(@PathVariable("course") String course) {
		return studentRepo.findByCourse(course);
	}
}