package com.ygr.controller;

import com.ygr.pojo.Employee;
import com.ygr.service.EmployeeService;
import com.ygr.service.impl.EmployeeServiceImpl;

public class EmployeeController {
	
	
	EmployeeService employeeService = new EmployeeServiceImpl();
	public void saveEmployee( Employee employee ) {
		
		employeeService.saveEmployee(employee);
		
	}
	
	public Employee get(Integer empId) {
		return employeeService.get(empId);
	}

}
