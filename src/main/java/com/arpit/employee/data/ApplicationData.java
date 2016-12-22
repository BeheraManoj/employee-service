package com.arpit.employee.data;

import java.util.ArrayList;
import java.util.List;

import com.arpit.employee.domain.Employee;

/**
 * Class <code>ApplicationData</code> exposes methods with dummy data.
 * 
 * @author ArpitAggarwal
 *
 */
public class ApplicationData {
	
	/**
	 * Get list of all employees.
	 * 
	 * @return {@link List<Employee>}
	 */
	public static List<Employee> getAllEmployees() {
		final List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "Arpit Aggarwal","aggarwalarpit.89@gmail.com"));
		employeeList.add(new Employee(2, "Sanjeev Singh","sanjeev.singh@gmail.com"));
		employeeList.add(new Employee(3, "Abhishek","abhishek@gmail.com"));
		return employeeList;
	}
}
