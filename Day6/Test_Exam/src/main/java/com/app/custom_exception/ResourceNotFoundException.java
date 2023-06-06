package com.app.custom_exception;

public class ResourceNotFoundException extends RuntimeException {
	public ResourceNotFoundException(String mesg,String mesg1,long id) {
		super(mesg + " "+ mesg1 + " "+ id);
	}

}
