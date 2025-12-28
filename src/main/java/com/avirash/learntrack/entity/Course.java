package com.avirash.learntrack.entity;

public class Course {
	
	long id;
	String courseName;
	String description;
	int durationInWeeks;
	boolean active;
	
	public Course() {
		super();
	}
	
	public Course(long id, String courseName, String description, int durationInWeeks, boolean active) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.description = description;
		this.durationInWeeks = durationInWeeks;
		this.active = active;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Course=>\n[id=" + id + "\ncourseName=" + courseName + "\ndescription=" + description
				+ "\ndurationInWeeks=" + durationInWeeks + "\nactive=" + active + "]";
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDurationInWeeks() {
		return durationInWeeks;
	}

	public void setDurationInWeeks(int durationInWeeks) {
		this.durationInWeeks = durationInWeeks;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}
