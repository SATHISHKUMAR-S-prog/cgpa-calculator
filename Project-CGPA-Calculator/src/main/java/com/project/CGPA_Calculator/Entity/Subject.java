package com.project.CGPA_Calculator.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int year;
	
	private String department;
	
	private int semester;
	
	private String subjectCode;
	
	private String subjectName;
	
	private int credit;
}
