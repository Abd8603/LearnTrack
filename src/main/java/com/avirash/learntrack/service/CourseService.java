package com.avirash.learntrack.service;

import java.util.ArrayList;
import java.util.List;

import com.avirash.learntrack.entity.Course;
import com.avirash.learntrack.exceptions.EntityNotFoundException;
import com.avirash.learntrack.exceptions.InvalidInputException;
import com.avirash.learntrack.utils.IdGenerator;
import com.avirash.learntrack.utils.ValidatorService;

public class CourseService {
	private static ArrayList<Course> listofCourses = new ArrayList<>();

	public Course addCourse(Course course) throws InvalidInputException {
		ValidatorService.validateCourse(course);
		course.setId(IdGenerator.getCourseId());
		course.setActive(true);
		listofCourses.add(course);
		return course;
	}

	public Course update(long id, boolean active) throws EntityNotFoundException {
		for (Course course : listofCourses) {
			if (course.getId() == id && !course.isActive()) {
				course.setActive(active);
				return course;
			}
		}
		throw new EntityNotFoundException();
	}

	public List<Course> getCourses() throws EntityNotFoundException {
		List<Course> activeCourses = listofCourses.stream().filter(Course::isActive).toList();
		if (activeCourses.isEmpty()) {
			throw new EntityNotFoundException();
		}
		return activeCourses;
	}
}
