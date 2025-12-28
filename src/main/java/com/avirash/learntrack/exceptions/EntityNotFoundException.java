package com.avirash.learntrack.exceptions;

public class EntityNotFoundException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public EntityNotFoundException() {
		super("Entity Not Found");

	}
	public EntityNotFoundException(String message) {
		super(message);

	}
}
