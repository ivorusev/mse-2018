package com.edu.ru.oop.robots;

public class RobotHitWallException extends RuntimeException {

	private static final long serialVersionUID = -8654010041846717477L;
	
	public RobotHitWallException(String message) {
		super(message);
	}
}
