package org.awda.middleware.util;

public class MessageBodyNullErrorException extends Exception {
	private static final long serialVersionUID = 1L;

	public MessageBodyNullErrorException(String message) {
		super(message);
	}
}
