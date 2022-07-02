package com.sts.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.project.model.Student;
import com.sts.project.repository.StudentRepository;

@RestController
@RequestMapping("school")
@CrossOrigin(origins = "http://localhost:3000/")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@GetMapping("studentall")
	public List<Student> getStudents() {
		return (List<Student>) studentRepository.findAll();
	}
	
	@GetMapping("studentall/{id}")
	public Optional<Student> getStudentById(@PathVariable int id) {
		return studentRepository.findById(id);
	}

	@PostMapping("studentall")
	public Student addStudent(@RequestBody Student student) {
		return studentRepository.save(student);
	}

	@PutMapping("/studentall/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
		return studentRepository.save(student);
		
	}

	@DeleteMapping("/studentall/{id}")
	public void deleteEmployee(@PathVariable int id) {
		studentRepository.deleteById(id);
		System.out.println("deleted");
	}

}
