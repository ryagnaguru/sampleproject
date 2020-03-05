package com.ygr.sample;

import java.util.Arrays;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ygr.controller.EmployeeController;
import com.ygr.pojo.Address;
import com.ygr.pojo.Employee;
import com.ygr.pojo.Project;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("application-context.xml");
		
		EmployeeController employeeController = applicationContext.getBean("employeeController", EmployeeController.class);
		
		saveEmployee(employeeController);
		
		
//		EmployeeController controller = new EmployeeController();
//		
//		saveEmployee(controller);
//		getemployee(1112, controller);
		
	}
	
	
	private static void getemployee(Integer empId, EmployeeController controller) {
		try {
			Employee employee = controller.get(empId);
			System.out.println("get ---- " +employee.getFirstName());
		} catch (Exception e) {
			System.out.println("there is no such employee with id "+ empId);
		}
	}

	private static void saveEmployee(EmployeeController controller) {
		Employee employee = new Employee();
		Address address = new Address();
		Project project = new Project();
		
		employee.setEmpId(1111);
		employee.setFirstName("Yagnaguru");
		employee.setLastName("ravichandran");
		
		address.setCity("chennai");
		address.setCountry("India");
		address.setDoorNo(1);
		address.setPhoneNumber(1234565789L);
		address.setState("TN");
		address.setStreet("stree");
		
		employee.setAddress(Arrays.asList(address));
		
		project.setClientName("FTD");
		project.setFromDate(new Date());
		project.setToDate(new Date());
		project.setProjectName("CRM");
		project.setManager("Ela");
		
		employee.setProjects(Arrays.asList(project));
		
		
		controller.saveEmployee(employee);
	}
	
}
