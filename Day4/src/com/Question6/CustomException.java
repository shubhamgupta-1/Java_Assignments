package com.Question6;

public class CustomException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomException(int number) {
		super("Number can't be greater than [ " + number + " ]");
	}
}
