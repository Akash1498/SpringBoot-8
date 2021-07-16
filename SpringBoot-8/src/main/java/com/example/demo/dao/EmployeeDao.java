package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.bean.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	List<Employee> findByEmpName(String name);
	List<Employee> findByEmpSalStringBetween(float lower, float higher);
	
	@Query("from Employee where empName=:name")
	List<Employee> searchUsingEmpName(@Param("name") String name);
	@Query("from Employee where empSalString>=:lower and empSalString<=:higher")
	List<Employee> inRangeOfEmpSalString(@Param("lower") float lower,@Param("higher") float higher);
	
	
}
