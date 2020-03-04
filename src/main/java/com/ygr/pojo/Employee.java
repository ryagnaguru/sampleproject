package com.ygr.pojo;

import java.io.Serializable;
import java.util.List;

// bean
public class Employee implements Serializable{
	
	private String firstName;
	private String lastName;
	private Integer empId;
	private List<Address> address;
	private List<Project> projects;
	public String getFirstName() {
		return firstName;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", empId=" + empId + ", address="
				+ address + ", projects=" + projects + "]";
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	
	
	

}
