package com.sts.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.sts.project.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
