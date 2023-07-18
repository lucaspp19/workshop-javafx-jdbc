package model.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ValidationExcepetion extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private Map<String, String> errors = new HashMap<>();

	public ValidationExcepetion(String msg) {
		super(msg);
	}

	public Map<String, String> getErrors() {

		return errors;

	}

	public void addErrors(String fieldName, String errorsMessage) {

		errors.put(fieldName, errorsMessage);

	}

}
