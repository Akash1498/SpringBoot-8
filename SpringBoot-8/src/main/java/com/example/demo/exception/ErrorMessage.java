package com.example.demo.exception;

public class ErrorMessage {
	private String error;
	private String desc;
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "ErrorMessage [error=" + error + ", desc=" + desc + "]";
	}
	public ErrorMessage(String error, String desc) {
		super();
		this.error = error;
		this.desc = desc;
	}
	public ErrorMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
