package com.arpit.employee.service;

import java.util.List;

import com.arpit.employee.domain.Employee;

/**
 * IEmployeeService is a service layer to create, update and details of an
 * {@link Employee}
 * 
 * @author ArpitAggarwal
 *
 */
public interface IEmployeeService {
	/**
	 * Save {@link Employee}
	 * 
	 * @param company
	 *            {@link Employee}
	 */
	void create(final Employee company);

	/**
	 * Get list of {@link Employee} for related search criteria
	 * 
	 * @param criteria
	 *            String filter to be used to search
	 * @return {@link List<Employee>} list of employees
	 */
	List<Employee> get(final String criteria);

}
