package com.project.CGPA_Calculator.Contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.CGPA_Calculator.Entity.Subject;
import com.project.CGPA_Calculator.Service.GPA_Service;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/GPA")
public class GPA_Controller {

	@Autowired
	private GPA_Service gpa_Service;
	
	
	@GetMapping("getsubject/{year}/{department}/{semester}")
	public List<Subject> getSubject(@PathVariable int year, @PathVariable String department,@PathVariable int semester){
		return gpa_Service.getSubject(year,department,semester);
	}
}
