package com.arpit.employee.domain;

public final class Employee {

	private int id;
	private String name;
	private String email;

	public Employee() {

	}

	public Employee(final int id, final String name, final String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email
				+ "]";
	}

}
