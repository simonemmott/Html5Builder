package com.k2.Html5Builder;

/**
 * The methods of the html builder API do not throw checked exceptions.
 * 
 * Instead any checked exceptions thrown by the underlying classes are wrapped up in this unchecked exception
 * 
 * @author simon
 *
 */
@SuppressWarnings("serial")
public class Html5BuilderError extends Error {
	
	/**
	 * Create an unchecked exception with the given message
	 * @param message The message for the new unchecked exception
	 */
	public Html5BuilderError(String message) {
		super(message);
	}

	/**
	 * Create an unchecked exception with the given message and unchecked exception
	 * @param message The message for the new unchecked exception
	 * @param err	The unchecked exception that gave rise to this error
	 */
	public Html5BuilderError(String message, Error err) {
		super(message, err);
	}

	/**
	 * Create an unchecked exception with the given message and checked exception
	 * @param message	The message for the new unchecked exception
	 * @param err	The checked exception that gave rise to this exception
	 */
	public Html5BuilderError(String message, Exception err) {
		super(message, err);
	}

}
