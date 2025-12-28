package com.avirash.learntrack.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.avirash.learntrack.entity.Student;
import com.avirash.learntrack.exceptions.EntityNotFoundException;
import com.avirash.learntrack.exceptions.InvalidInputException;
import com.avirash.learntrack.utils.IdGenerator;
import com.avirash.learntrack.utils.ValidatorService;

public class StudentService {
	private static ArrayList<Student> listOfStudents = new ArrayList<>();

	
	public Student addStudent(Student student) throws InvalidInputException {
			ValidatorService.validateStudent(student);

			student.setId(IdGenerator.getStudentId());
			student.setActive(true);
			listOfStudents.add(student);
		
		return student;
	}

	public Student getStudent(long id) throws EntityNotFoundException {
		Optional<Student> optionalStudent = listOfStudents.stream()
				.filter(student -> student.isActive() && student.getId() == id).findFirst();
		if (optionalStudent.isPresent()) {
			return optionalStudent.get();
		}
		throw new EntityNotFoundException();
	}

	// Use of method overloading
	public List<Student> getStudents(String fisrtName) throws EntityNotFoundException {
		List<Student> listOfFilteredStudent = listOfStudents.stream()
				.filter(student -> student.isActive() && student.getFirstName().equalsIgnoreCase(fisrtName)).toList();
		if (listOfFilteredStudent.isEmpty()) {
			throw new EntityNotFoundException();
		}
		return listOfFilteredStudent;
	}

	public List<Student> getStudents() throws EntityNotFoundException {
		List<Student> activeStudents = listOfStudents.stream().filter(Student::isActive).toList();
		if (activeStudents.isEmpty()) {
			throw new EntityNotFoundException();
		}
		return activeStudents;
	}

	public Student deleteStudent(long id) throws EntityNotFoundException {
		for (Student student : listOfStudents) {
			if (student.getId() == id && student.isActive()) {
				student.setActive(false);
				return student;
			}
		}
		throw new EntityNotFoundException();
	}
}
