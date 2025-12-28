package com.avirash.learntrack.service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.avirash.learntrack.entity.Enrollment;
import com.avirash.learntrack.enums.Status;
import com.avirash.learntrack.exceptions.EntityNotFoundException;
import com.avirash.learntrack.exceptions.InvalidInputException;
import com.avirash.learntrack.utils.IdGenerator;
import com.avirash.learntrack.utils.ValidatorService;

public class EnrollmentService {

	private static ArrayList<Enrollment> listOfEnrollments = new ArrayList<>();

	public Enrollment addEnrollment(Enrollment enrollment) throws InvalidInputException {
		ValidatorService.validateEnrollment(enrollment);
		enrollment.setId(IdGenerator.getEnrollmentId());
		enrollment.setStatus(Status.ACTIVE);
		enrollment.setEnrollmentDate(Date.from(Instant.now()));
		listOfEnrollments.add(enrollment);
		return enrollment;
	}

	public List<Enrollment> getEnrollments(long studentId) throws EntityNotFoundException {
		List<Enrollment> enrollmentList = listOfEnrollments.stream()
				.filter(enrollment -> enrollment.getStudentId() == studentId).toList();
		if (enrollmentList.isEmpty()) {
			throw new EntityNotFoundException();
		}
		return enrollmentList;
	}

	public Enrollment changeStatus(long enrollmentId, Status status) throws EntityNotFoundException {
		for (Enrollment enrollment : listOfEnrollments) {
			if (enrollment.getId() == enrollmentId) {
				enrollment.setStatus(status);
				return enrollment;
			}
		}
		throw new EntityNotFoundException();
	}

}
