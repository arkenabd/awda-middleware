package org.awda.middleware.pojo.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response <T>{

	private Integer code;
	private String message;
	private T result;
	
	
	Integer getCode() {
		return code;
	}
	void setCode(Integer code) {
		this.code = code;
	}
	String getMessage() {
		return message;
	}
	void setMessage(String message) {
		this.message = message;
	}
	T getResult() {
		return result;
	}
	void setResult(T result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Response [code=" + code + ", message=" + message + ", result=" + result + "]";
	}
}
