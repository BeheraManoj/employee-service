package com.arpit.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arpit.employee.domain.Employee;
import com.arpit.employee.service.IEmployeeService;

/**
 * Class <code>EmployeeController</code> bind create, update and details of a
 * {@link Employee} actions from user interface.
 * 
 * @author ArpitAggarwal
 *
 */
@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;

	@PostMapping(value = "/create")
	public void create(@RequestBody Employee employee) {
		employeeService.create(employee);
	}

	@GetMapping("/get")
	public List<Employee> get(@RequestParam(required = false) String filter) {
		return employeeService.get(filter);
	}

}
