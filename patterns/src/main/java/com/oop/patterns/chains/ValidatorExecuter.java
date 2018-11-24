package com.oop.patterns.chains;

import java.util.ArrayList;
import java.util.List;

import com.oop.patterns.builder.Fish;

public class ValidatorExecuter {

	private FishValidator start;

	public ValidatorExecuter() {
		FishValidator color = new FishColorValidator();
		FishValidator length = new FishLenghtValidator(color);
		start = new FishNameValidator(length);
	}

	public List<String> executeValidation(Fish fish) {
		List<String> result = new ArrayList<>();
		do {
			result.add(start.handle(fish));
			start = start.getNextValidator();
		} while (start != null);
		return result;
	}

}
