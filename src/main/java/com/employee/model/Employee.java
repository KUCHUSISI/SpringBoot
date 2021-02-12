package com.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	@Column
	private int empId;
	@Column
	private String empName;
	@Column
	private String empCompanyName;
	@Column
	private String empLocation;
	public int getEmpid() {
		return empId;
	}
	public void setEmpid(int empid) {
		this.empId = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCompanyName() {
		return empCompanyName;
	}
	public void setCompanyName(String companyName) {
		empCompanyName = companyName;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
}