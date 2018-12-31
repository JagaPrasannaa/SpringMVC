package com.wipro.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "employee")
	@SequenceGenerator(name = "employee", sequenceName = "employee_id_seq")
	private int employeeId;

	@Column(columnDefinition = "VARCHAR(25)")
	private String empName;
	@Column(columnDefinition = "VARCHAR(40)")
	private String dept;
	@Column(columnDefinition = "VARCHAR(40)")
	private String designation;
	@Column(columnDefinition = "NUMBER(7,2)")
	private double salary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
