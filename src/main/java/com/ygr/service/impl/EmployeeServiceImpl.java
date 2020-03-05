package com.ygr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ygr.dao.EmployeeDao;
import com.ygr.pojo.Employee;
import com.ygr.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao dao;
	public void saveEmployee(Employee employee) {

		dao.saveEmployee(employee);
	}
	
	public Employee get(Integer empId) {
		return dao.get(empId);
	}

}
