package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeService employeeservice;
	@GetMapping("/employee/{empid}")
	public Employee getEmployeeById(@PathVariable("empid") int empid)
	{
		System.out.println("inside the employee controller class");
		return employeeservice.retrieveStudent(empid);
	}
}
