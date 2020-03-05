package com.ygr.service.impl;

import com.ygr.dao.EmployeeDao;
import com.ygr.daoImpl.EmployeeDaoImpl;
import com.ygr.pojo.Employee;
import com.ygr.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao dao = new EmployeeDaoImpl();
	public void saveEmployee(Employee employee) {
		dao.saveEmployee(employee);
	}
	
	public Employee get(Integer empId) {
		return dao.get(empId);
	}

}
