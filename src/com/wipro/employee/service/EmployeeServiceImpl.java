package com.wipro.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.employee.dao.EmployeeDAO;
import com.wipro.employee.model.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	
	@Override
	public String doRegister(Employee employee) {
		return employeeDAO.doRegister(employee);
	}

	
	@Override
	public List<Employee> getAllEmployee() {
		return employeeDAO.getAllEmployee();
	}

	
	@Override
	public String doModify(Employee employee) {
		return employeeDAO.doModify(employee);
	}

	
	@Override
	public List<Integer> getEmployeeId() {
		return employeeDAO.getEmployeeId();
	}


	@Override
	public Employee getEmployee(int employeeId) {
		
		return employeeDAO.getEmployee(employeeId);
	}

	
	@Override
	public void doDelete(int employeeId) {
		employeeDAO.doDelete(employeeId);
		
	}

}
