package com.ygr.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.ygr.pojo.Employee;
import com.ygr.service.EmployeeService;

public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	public void saveEmployee( Employee employee ) {
		
		employeeService.saveEmployee(employee);
		
	}
	
	public Employee get(Integer empId) {
		return employeeService.get(empId);
	}

}
