package com.example.demo;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="capgemini",enableByDefault = true)
public class MyEndPoint {
	@ReadOperation
	public MyResponse feature() {
	return new MyResponse(101, "Health Of Default EndPoint", "All EndPoints are Up and Running");
	
}
class MyResponse{
	int id;
	private String response;
	private String desc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "MyResponse [id=" + id + ", response=" + response + ", desc=" + desc + "]";
	}
	public MyResponse(int id, String response, String desc) {
		super();
		this.id = id;
		this.response = response;
		this.desc = desc;
	}
	public MyResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
}
