package com.example.EmployeeMgmt.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "EmployeeLeaves")
public class EmployeeLeaves {
	
	//@Transient
    public static final String SEQUENCE_NAME = "emp_leave_sequence";

	@Id
	int id;
	String empId;
	String name;
	int leaves_left;
	int leaves_applied;
	int leaves_approved;
	
	
	public EmployeeLeaves(String empId,String name, int leaves_left, int leaves_applied, int leaves_approved) {
		super();
		this.empId = empId;
		this.name = name;
		this.leaves_left = leaves_left;
		this.leaves_applied = leaves_applied;
		this.leaves_approved = leaves_approved;
		
	}
	public EmployeeLeaves() {

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLeaves_left() {
		return leaves_left;
	}
	public void setLeaves_left(int leaves_left) {
		this.leaves_left = leaves_left;
	}
	public int getLeaves_applied() {
		return leaves_applied;
	}
	public void setLeaves_applied(int leaves_applied) {
		this.leaves_applied = leaves_applied;
	}
	public int getLeaves_approved() {
		return leaves_approved;
	}
	public void setLeaves_approved(int leaves_approved) {
		this.leaves_approved = leaves_approved;
	}
	
	
}
