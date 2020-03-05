package com.ygr.daoImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ygr.dao.EmployeeDao;
import com.ygr.pojo.Address;
import com.ygr.pojo.Employee;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	
	Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

	public void saveEmployee(Employee employee) {
		employeeMap.put(employee.getEmpId(), employee);
	} 
	
	public Employee get(Integer empId) {
		
		Employee employee = employeeMap.get(empId);
		List<Address> addresses = employee.getAddress();
		
		for( Address address : addresses ) {
			if( address.getCity().equalsIgnoreCase("chennai")) {
				System.out.println("city -- " +address.getCity());
			}
		}
		
		return employeeMap.get(empId);
	}

}
