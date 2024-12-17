package com.project.CGPA_Calculator.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.CGPA_Calculator.Entity.Credits;

@Repository
public interface CreditsRepository extends JpaRepository<Credits, Integer>{

	  @Query(value = "SELECT * FROM credits s WHERE s.year = :year AND s.department = :department", nativeQuery = true)
	    List<Credits> findByYearDepartment(
	        @Param("year") int year,
	        @Param("department") String department
	    );
}
