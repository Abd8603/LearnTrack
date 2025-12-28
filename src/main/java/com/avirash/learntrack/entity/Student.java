package com.avirash.learntrack.entity;

public class Student extends Person {

	//Currently Not using batch as no such link with other class found, also asked about this in discussion of project page. Got no luck
	String batch;

	public Student(long id, String firstName, String lastName, String emailId, boolean status, String batch) {
		super(id, firstName, lastName, emailId, status);
		this.batch = batch;
	}

	public Student() {
	}

	@Override
	String getPersonType() {
		return "Student";
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	@Override
	public String toString() {
		return "Student=>\n[id=" + id + "\nfirstName=" + firstName + "\nlastName=" + lastName + "\nemailId=" + emailId
				+ "\nactive=" + active + "]";
	}

	
	
}
