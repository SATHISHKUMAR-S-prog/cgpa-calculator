package com.project.CGPA_Calculator.Contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.CGPA_Calculator.Entity.Credits;
import com.project.CGPA_Calculator.Service.CGPA_Service;

@RestController
@CrossOrigin
@RequestMapping("/CGPA")
public class CGPA_Controller {

	@Autowired
	private CGPA_Service cgpa_Service;
	
	@PostMapping("post")
	public ResponseEntity<String> addCredits( @RequestBody Credits credits){
		return cgpa_Service.addCredits(credits);
	}
	
	@GetMapping("getCredits/{year}/{department}")
	public ResponseEntity<List<Credits>> getCredits(@PathVariable int year,@PathVariable String department){
		return cgpa_Service.getCredits(year,department);
	}
}
