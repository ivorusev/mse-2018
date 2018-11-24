package com.oop.patterns.chains;

import com.oop.patterns.builder.Fish;

public class FishLenghtValidator extends FishValidator {

	public FishLenghtValidator(FishValidator validator) {
		super(validator);
	}
	
	@Override
	public String handle(Fish fish) {
		if (fish.getLength() > 0 && fish.getLength() < 12) {
			return "SUCCESSFUL LENGTH VALIDATION";
		}
		return "FAILED LENGTH VALIDATION";
	}

}
