package com.oop.patterns.chains;

import java.util.List;

import com.oop.patterns.builder.Fish;

public class Launcher {

	public static void main(String[] args) {
		ValidatorExecuter exec = new ValidatorExecuter();
		Fish.Builder builder = new Fish.Builder();
		Fish fish = builder.setColor("#WEWEWEWE").setName("Kit").setSize(11).build();
		List<String> result = exec.executeValidation(fish);
		result.stream().forEach(System.out::println);
	}

}
