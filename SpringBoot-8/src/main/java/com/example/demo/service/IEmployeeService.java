package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.Employee;

public interface IEmployeeService{
	List<Employee> getAllEmployees();
	Employee getEmployeesWithId(int empId);
	Employee addEmployee(Employee emp);
	Employee updateEmployee(int empId,Employee emp);
	void deleteEmployee(int empId);
	List<Employee> getEmployeesByName(String name);
	List<Employee> getEmpSalStringBetween(float lower, float higher);

}
