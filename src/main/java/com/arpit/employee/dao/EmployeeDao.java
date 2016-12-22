package com.arpit.employee.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.arpit.employee.data.ApplicationData;
import com.arpit.employee.domain.Employee;

/**
 * Class <code>EmployeeDao</code> contains definition to be used to save
 * {@link Employee} objects.
 * 
 * @author ArpitAggarwal
 */
@Repository
public class EmployeeDao extends BaseDao<Employee> {

	@Override
	protected Class<Employee> getEntityClass() {
		return Employee.class;
	}

	public List<Employee> findAll() {
		return ApplicationData.getAllEmployees();
	}

}
