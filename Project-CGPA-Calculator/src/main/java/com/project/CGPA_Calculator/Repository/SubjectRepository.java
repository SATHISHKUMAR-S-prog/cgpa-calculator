package com.project.CGPA_Calculator.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.CGPA_Calculator.Entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
    
    @Query(value = "SELECT * FROM subject s WHERE s.year = :year AND s.department = :department AND s.semester = :semester", nativeQuery = true)
    List<Subject> findByYearDepartmentSemester(
        @Param("year") int year,
        @Param("department") String department,
        @Param("semester") int semester
    );
}
