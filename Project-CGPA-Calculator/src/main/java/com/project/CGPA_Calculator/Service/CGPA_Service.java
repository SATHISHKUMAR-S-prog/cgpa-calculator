package com.project.CGPA_Calculator.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.CGPA_Calculator.Entity.Credits;
import com.project.CGPA_Calculator.Repository.CreditsRepository;

@Service
public class CGPA_Service {
	
	@Autowired
	private CreditsRepository creditsRepository;

	public ResponseEntity<String> addCredits(Credits credits) {
		try {
			creditsRepository.save(credits);
			return new ResponseEntity<>("success",HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage() ,HttpStatus.BAD_REQUEST);
		}
	}

	public ResponseEntity<List<Credits>> getCredits(int year, String department) {
		try {
			List<Credits> credits = creditsRepository.findByYearDepartment(year, department);
			return new ResponseEntity<>(credits,HttpStatus.OK);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	return new ResponseEntity<>( new ArrayList<>(),HttpStatus.BAD_REQUEST);
	}

}
