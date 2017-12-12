package com.k2.Html5Builder;

public class Html5BuilderError extends Error {
	
	public Html5BuilderError(String message) {
		super(message);
	}

	public Html5BuilderError(String message, Error err) {
		super(message, err);
	}

	public Html5BuilderError(String message, Exception err) {
		super(message, err);
	}

}
