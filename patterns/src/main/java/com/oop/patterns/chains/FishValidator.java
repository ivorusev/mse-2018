package com.oop.patterns.chains;

import com.oop.patterns.builder.Fish;

public abstract class FishValidator {

	private FishValidator nextValidator;
	
	public FishValidator() {
	}
	
	public FishValidator(FishValidator next) {
		this.nextValidator = next;
	}
	
	public abstract String handle(Fish fish);

	public FishValidator getNextValidator() {
		return nextValidator;
	}
}
