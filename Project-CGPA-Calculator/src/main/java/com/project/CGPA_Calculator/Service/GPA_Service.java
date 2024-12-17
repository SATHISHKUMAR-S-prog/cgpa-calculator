package com.project.CGPA_Calculator.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.CGPA_Calculator.Entity.Subject;
import com.project.CGPA_Calculator.Repository.SubjectRepository;

@Service
public class GPA_Service {
	
	@Autowired
	private SubjectRepository subjectRepository;

	public List<Subject> getSubject(int year, String department, int semester) {
		List<Subject> subject = subjectRepository.findByYearDepartmentSemester(year, department, semester);
		return subject;
	}

	
}
