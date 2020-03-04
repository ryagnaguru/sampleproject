package com.ygr.pojo;

import java.io.Serializable;
import java.util.Date;

public class Project implements Serializable{
	
	private String projectName;
	private String clientName;
	private String manager;
	private Date fromDate;
	private Date toDate;
	
	
	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", clientName=" + clientName + ", manager=" + manager
				+ ", fromDate=" + fromDate + ", toDate=" + toDate + "]";
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	
	

}
