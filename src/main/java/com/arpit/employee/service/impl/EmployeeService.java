package com.arpit.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arpit.employee.dao.EmployeeDao;
import com.arpit.employee.domain.Employee;
import com.arpit.employee.service.IEmployeeService;

/**
 * Class <code>EmployeeService</code> an implementation of
 * com.arpit.employee.service.IEmployeeService to create and get an
 * {@link Employee}
 * 
 * @author ArpitAggarwal
 *
 */
@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public void create(final Employee company) {
		if (company != null) {
			employeeDao.save(company);
		}
	}

	public void update(Employee company) {
		if (company != null) {
			employeeDao.update(company);
		}
	}

	public List<Employee> get(final String criteria) {
		return employeeDao.findAll();
	}
}