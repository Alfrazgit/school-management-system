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

import com.sts.project.model.Parent;
import com.sts.project.repository.ParentRepository;

@RestController
@RequestMapping("school")
@CrossOrigin(origins = "http://localhost:3000/")
public class ParentController {

	@Autowired
	private ParentRepository parentRepository;

	@GetMapping("parentall")
	public List<Parent> getParents() {
		return (List<Parent>) parentRepository.findAll();
	}
	
	@GetMapping("parentall/{id}")
	public Optional<Parent> getParentById(@PathVariable int id) {
		return parentRepository.findById(id);
	}

	@PostMapping("parentall")
	public Parent addParent(@RequestBody Parent parent) {
		return parentRepository.save(parent);
	}

	@PutMapping("/parentall/{id}")
	public Parent updateParent(@PathVariable int id, @RequestBody Parent parent) {
		return parentRepository.save(parent);
	}

	@DeleteMapping("/parentall/{id}")
	public Optional<Parent> deleteParent(@PathVariable int id) {
		Optional<Parent> parent = parentRepository.findById(id);
		parentRepository.deleteById(id);
		System.out.println("deleted");
		return parent;
	}
	
}
