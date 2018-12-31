package com.wipro.employee.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.employee.model.Employee;

@Repository("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	@Override
	public String doRegister(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
		return "employee";
	}

	@Transactional
	@Override
	public List<Employee> getAllEmployee() {
		List employees = sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
		return employees;
	}

	@Transactional
	@Override
	public String doModify(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);
		return "modify";
	}

	@Transactional
	@Override
	public List<Integer> getEmployeeId() {
		List employeeIds = sessionFactory.getCurrentSession().createCriteria(Employee.class)
				.setProjection(Projections.property("employeeId")).list();
		return employeeIds;
	}

	@Transactional
	@Override
	public Employee getEmployee(int employeeId) {

		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, employeeId);
	}

	@Transactional
	@Override
	public void doDelete(int employeeId) {
		sessionFactory.getCurrentSession().delete(getEmployee(employeeId));

	}

}












