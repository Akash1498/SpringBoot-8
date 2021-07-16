package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee {
	@Id
	private int empId;
	private String empName;
	private float empSalString;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSalString() {
		return empSalString;
	}
	public void setEmpSalString(float empSalString) {
		this.empSalString = empSalString;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalString=" + empSalString + "]";
	}
	public Employee(int empId, String empName, float empSalString) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalString = empSalString;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
