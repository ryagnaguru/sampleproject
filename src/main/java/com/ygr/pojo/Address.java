package com.ygr.pojo;

import java.io.Serializable;

public class Address implements Serializable {

	private Integer doorNo;
	private String street;
	private String city;
	private String state;
	private String country;
	private Long phoneNumber;
	
	
	
	public Integer getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(Integer doorNo) {
		this.doorNo = doorNo;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", city=" + city + ", state=" + state + ", country="
				+ country + ", phoneNumber=" + phoneNumber + "]";
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
}
