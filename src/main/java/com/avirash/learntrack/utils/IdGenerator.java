package com.avirash.learntrack.utils;

public class IdGenerator {
	private static long studentId = 0;
	private static long courseId = 0;
	private static long enrollmentId = 0;
	
	public static long getStudentId() {
		return ++studentId;
	}
	public static long getCourseId() {
		return ++courseId;
	}
	public static long getEnrollmentId() {
		return ++enrollmentId;
	}
	
	
}
