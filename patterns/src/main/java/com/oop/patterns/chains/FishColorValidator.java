package com.oop.patterns.chains;

import com.oop.patterns.builder.Fish;

public class FishColorValidator extends FishValidator {
	
	public FishColorValidator() {
	}
	
	public FishColorValidator(FishValidator validator) {
		super(validator);
	}

	@Override
	public String handle(Fish fish) {
		if (fish.getColor().matches("#[0-9A-F]{6}")) {
			return "SUCESSFUL COLOR VALIDATION";
		}
		return "FAILED VALIDATION";
	}

}
