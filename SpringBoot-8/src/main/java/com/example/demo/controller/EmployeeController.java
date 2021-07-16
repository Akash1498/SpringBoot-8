package com.example.demo.controller;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Employee;
import com.example.demo.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeServiceImpl service;
	
	@GetMapping("/employees/name/{name}")
	public List<Employee> getEmployeesByName(@PathVariable String name){
		return service.getEmployeesByName(name);
	}
	@GetMapping("/employees/salary/{lower}/{higher}")
	public List<Employee>  getEmpSalStringBetween(@PathVariable float lower,@PathVariable float higher){
		return service.getEmpSalStringBetween(lower,higher);
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return service.getAllEmployees();
	}
	@GetMapping("/employee/{empId}")
	public Employee getEmployeesWithId(@PathVariable int empId){
		return service.getEmployeesWithId(empId);
	}
	@PostMapping("/employee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp){
		return new ResponseEntity(service.addEmployee(emp),HttpStatus.CREATED);
	}
	@PutMapping("/employee/{empId}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable int empId,@RequestBody Employee emp) {
		return new ResponseEntity(service.updateEmployee(empId, emp),HttpStatus.ACCEPTED);
	}
	@DeleteMapping("/employee/{empId}")
	public void deleteEmployee(@PathVariable int empId) {
//		service.deleteEmployee(empId);
		throw new RuntimeException("This is an error due to application");
	}

}
