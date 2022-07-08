package com.sts.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.sts.project.model.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher, String> {

}
