package com.wipro.employee.dao;

import java.util.List;

import com.wipro.employee.model.Employee;

public interface EmployeeDAO {

	String doRegister(Employee employee);
	String doModify(Employee employee);
	void doDelete(int employeeId);
	Employee getEmployee(int employeeId);
	List<Integer> getEmployeeId();
	List<Employee> getAllEmployee(); 
}
