package com.svmapp.model;

public class ResponseModel {

public static final int ERROR_JAPA_EXISTS_FOR_DATE = 1001;
	
	private int response_code;
	private String response_message;
	
	public ResponseModel(int response_code, String response_message) {
		this.response_code = response_code;
		this.response_message = response_message;
	}
	
	public int getResponse_code() {
		return response_code;
	}
	public void setResponse_code(int response_code) {
		this.response_code = response_code;
	}
	public String getResponse_message() {
		return response_message;
	}
	public void setResponse_message(String response_message) {
		this.response_message = response_message;
	}
}
