 package com.example.EmployeeMgmt.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "EmployeeNotice")
public class EmployeeNotice {
	@Id
	int id;
	String empId;
	String from;
	String message;
	public EmployeeNotice(String empId,String from, String message) {
		super();
		this.empId = empId;
		this.from = from;
		this.message = message;
	}
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
