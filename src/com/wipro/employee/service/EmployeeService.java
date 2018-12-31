package com.wipro.employee.service;

import java.util.List;

import com.wipro.employee.model.Employee;

public interface EmployeeService {

	String doRegister(Employee employee);
	String doModify(Employee employee);
	void doDelete(int employeeId);
	Employee getEmployee(int employeeId);
	List<Integer> getEmployeeId();
	List<Employee> getAllEmployee();
}
