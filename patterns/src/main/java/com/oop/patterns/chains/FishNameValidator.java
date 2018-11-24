package com.oop.patterns.chains;

import com.oop.patterns.builder.Fish;

public class FishNameValidator extends FishValidator {

	public FishNameValidator(FishValidator validator) {
		super(validator);
	}
	
	@Override
	public String handle(Fish fish) {
		if (fish.getName().matches("[A-Za-z]{2,10}")) {
			return "SUCCESSFUL NAME VALIDATION";
		}
		return "FAILED VALIDATION";
	}

}
