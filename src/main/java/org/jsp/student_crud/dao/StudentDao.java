package org.jsp.student_crud.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.student_crud.dto.Student;
import org.jsp.student_crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {
	@Autowired
	StudentRepository repository;

	public Student save(Student student) {
		return repository.save(student);
	}

	public List<Student> save(List<Student> students) {
		return repository.saveAll(students);
	}

	public Student fetchById(int id) {
		Optional<Student> optional = repository.findById(id);
		if (optional.isEmpty()) {
			return null;
		} else {
			return optional.get();
		}
	}

	public List<Student> fetchAll() {
		return repository.findAll();
	}

	public List<Student> fetchByName(String name) {
		return repository.findByName(name);
	}

	public List<Student> fetchByMobile(long mobile) {
		return repository.findByMobile(mobile);
	}

	public List<Student> fetchByStandard(int standard) {
		return repository.findByStandard(standard);
	}

	public List<Student> fetchResult(String result) {
		return repository.findByResult(result);
	}

	public List<Student> fetchScienceMarks(int marks) {
		return repository.findByScienceMarks(marks);
	}

	public void delete(int id) {
		repository.deleteById(id);
	}
}