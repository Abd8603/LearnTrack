package com.avirash.learntrack.entity;

//Class only made to show to inheritance
public class Trainer extends Person {

	String subjectExpert;

	public Trainer(long id, String firstName, String lastName, String emailId, boolean status, String subjectExpert) {
		super(id, firstName, lastName, emailId, status);
		this.subjectExpert = subjectExpert;
	}

	@Override
	String getPersonType() {
		return "Trainer";
	}

	public String getSubjectExpert() {
		return subjectExpert;
	}

	public void setSubjectExpert(String subjectExpert) {
		this.subjectExpert = subjectExpert;
	}

}
