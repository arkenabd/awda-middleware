package org.awda.middleware.util;

public class MessageErrorException extends Exception {
	private static final long serialVersionUID = 1L;

	public MessageErrorException(String message) {
		super(message);
	}
}
