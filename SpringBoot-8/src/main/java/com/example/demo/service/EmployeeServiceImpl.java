package com.example.demo.service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Employee;
import com.example.demo.dao.EmployeeDao;
import com.fasterxml.jackson.core.sym.Name;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	EmployeeDao dao;
	
	public List<Employee>getAllEmployees(){
		return dao.findAll();
	}
	
//	public List<Employee> getEmployeesByName(String name){
//		return dao.findByEmpName(name);
//	}
	
	//using custom query
	public List<Employee> getEmployeesByName(String name){
		return dao.searchUsingEmpName(name);
	}
//	public List<Employee> getEmpSalStringBetween(float lower, float higher){
//		return dao.findByEmpSalStringBetween(lower, higher);
//	}
	
	//using custom query
	public List<Employee> getEmpSalStringBetween(float lower, float higher){
		return dao.inRangeOfEmpSalString(lower, higher);
	}
	public Employee getEmployeesWithId(int empId){
		return dao.getById(empId);
	}
	public Employee addEmployee(Employee emp) {
		return dao.save(emp);
	}
	public Employee updateEmployee(int empId,Employee emp) {
		return dao.save(emp);
	}
	public void deleteEmployee(int empId) {
		dao.deleteById(empId);
	}


}
