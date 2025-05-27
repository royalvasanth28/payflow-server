package com.payflow.payflow.exception;

public class ResourceNotFoundException extends RuntimeException {
	@Override
	public String getMessage() {
		return "No customers found";
	}
}
