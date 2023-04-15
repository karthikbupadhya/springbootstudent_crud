package org.jsp.student_crud.repository;

import java.util.List;
import org.jsp.student_crud.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	List<Student> findByName(String name);

	List<Student> findByMobile(long mobile);

	List<Student> findByStandard(int standard);

	List<Student> findByResult(String string);

	@Query("select x from Student x where science>=?1")
	List<Student> findByScienceMarks(int marks);
}