package com.order.Exception;

import org.springframework.stereotype.Component;

@Component
public class EmptyInputException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorcode;
	private String errormessage;
	public String getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}
	public String getErrormessage() {
		return errormessage;
	}
	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}
	public EmptyInputException(String errorcode, String errormessage) {
		super();
		this.errorcode = errorcode;
		this.errormessage = errormessage;
	}
	public EmptyInputException() {
		
	}
	

}
