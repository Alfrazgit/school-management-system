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

import com.sts.project.model.Teacher;
import com.sts.project.repository.TeacherRepository;

@RestController
@RequestMapping("school")
@CrossOrigin(origins = "http://localhost:3000/")
public class TeacherController {

	@Autowired
	private TeacherRepository teacherRepository;

	@GetMapping("teacherall")
	public List<Teacher> getTeachers() {
		return (List<Teacher>) teacherRepository.findAll();
	}
	
	@GetMapping("teacherall/{id}")
	public Optional<Teacher> getTeacherById(@PathVariable String id) {
		return teacherRepository.findById(id);
	}

	@PostMapping("teacherall")
	public Teacher addTeacher(@RequestBody Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	@PutMapping("/teacherall/{id}")
	public Teacher updateTeacher(@PathVariable String id, @RequestBody Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	@DeleteMapping("/teacherall/{id}")
	public void deleteTeacher(@PathVariable String id) {
		teacherRepository.deleteById(id);
		System.out.println("deleted");
	}

}
