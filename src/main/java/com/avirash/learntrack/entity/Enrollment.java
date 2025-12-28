package com.avirash.learntrack.entity;

import java.util.Date;

import com.avirash.learntrack.enums.Status;

public class Enrollment {
	

	long id;
	long courseId;
	long studentId;
	Date enrollmentDate;
	Status status;
	
	public Enrollment() {
		super();
	}
	
	public Enrollment(long id, long courseId, long studentId, Date enrollmentDate, Status status) {
		super();
		this.id = id;
		this.courseId = courseId;
		this.studentId = studentId;
		this.enrollmentDate = enrollmentDate;
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public Date getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
}
