package org.jsp.student_crud.dto;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
@Component
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	long mobile;
	int standard;
	int science;
	int mathematics;
	int social;
	int english;
	int kannada;
	int hindi;
	double percentage;
	String result;
}