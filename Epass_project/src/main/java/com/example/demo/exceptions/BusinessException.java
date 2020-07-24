package com.example.demo.exceptions;

public class BusinessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private String message;
	public BusinessException(String message) {
		super(message);
	}

}
