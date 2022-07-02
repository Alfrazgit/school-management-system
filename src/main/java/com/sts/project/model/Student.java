package com.sts.project.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="students")
public class Student {

	@Id
	private int student_id;
	private String name;
	private int student_class;
	private String section;
	private int roll;
	private Date dob;
	private int parent_id;
}
