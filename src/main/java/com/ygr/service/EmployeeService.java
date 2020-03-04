package com.ygr.service;

import com.ygr.pojo.Employee;

public interface EmployeeService {
	
	void saveEmployee(Employee employee);
	public Employee get(Integer empId);

}
