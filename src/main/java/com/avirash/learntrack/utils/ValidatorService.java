package com.avirash.learntrack.utils;

import com.avirash.learntrack.entity.Course;
import com.avirash.learntrack.entity.Enrollment;
import com.avirash.learntrack.entity.Student;
import com.avirash.learntrack.exceptions.InvalidInputException;

public class ValidatorService {

	public static void validateStudent(Student student) throws InvalidInputException {
		String errorMessageString = "";
		if (student == null) {
			errorMessageString = "Student Data is null";
		} else {
			if (student.getFirstName() == null || student.getFirstName().isBlank()) {
				errorMessageString += "Student first name is null or blank\n";
			}
			if (student.getLastName() == null || student.getLastName().isBlank()) {
				errorMessageString += "Student last name is null or blank\n";
			}
			if (student.getEmailId() == null || student.getEmailId().isBlank()) {
				errorMessageString += "Student email ID is null or blank\n";
			}
		}
		if (errorMessageString.isBlank()) {
			return;
		}
		throw new InvalidInputException(errorMessageString);
	}

	public static void validateCourse(Course course) throws InvalidInputException {
		String errorMessageString = "";
		if (course == null) {
			errorMessageString = "Course Data is null";
		} else {
			if (course.getCourseName() == null || course.getCourseName().isBlank()) {
				errorMessageString += "Course name is null or blank\n";
			}
			if (course.getDescription() == null || course.getDescription().isBlank()) {
				errorMessageString += "Course description is null or blank\n";
			}
			if (course.getDurationInWeeks() < 0) {
				errorMessageString += "Course duration is less than 0\n";
			}
		}
		if (errorMessageString.isBlank()) {
			return;
		}
		throw new InvalidInputException(errorMessageString);
		
	}

	public static void validateEnrollment(Enrollment enrollment) throws InvalidInputException {
		String errorMessageString = "";
		if (enrollment == null) {
			errorMessageString = "Enrollment Data is null";
		} else {
			if (enrollment.getCourseId() < 0) {
				errorMessageString += "Enrollment course ID is less than 0\n";
			}
			if (enrollment.getStudentId() < 0) {
				errorMessageString += "Enrollment student ID is less than 0\n";
			}
		}
		if (errorMessageString.isBlank()) {
			return;
		}
		throw new InvalidInputException(errorMessageString);
		
	}
}
