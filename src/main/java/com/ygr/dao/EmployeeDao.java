package com.ygr.dao;

import com.ygr.pojo.Employee;

public interface EmployeeDao {

	void saveEmployee( Employee employee);
	public Employee get(Integer empId);
}
