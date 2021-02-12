package com.employee.service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

public class EmployeeService 
{
	EmployeeRepository employeerepository;
	public Employee retrieveStudent(int empId)
	{
		System.out.println("inside  the  employee service");
		return employeerepository.findById(empId).get();
	}
}
