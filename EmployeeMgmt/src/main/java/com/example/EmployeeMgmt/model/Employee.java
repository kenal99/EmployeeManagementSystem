package com.example.EmployeeMgmt.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Employee")
public class Employee {
	

	@Id
	String empId;
	int user_type;
	String name;
	String DOJ;
	String password;
	String phone;
	String email;
	String role;
	Float salary;
	String increment_status;
	String security_clearance;
	String location; 
	public Employee()
	{
		
	}
	public Employee(int user_type, String name, String DOJ, String password, String phone, String email, String role,
			Float salary, String increment_status, String security_clearance, String location) {
		super();
		this.user_type = user_type;
		this.name = name;
		this.DOJ = DOJ;
		this.password = password;
		this.phone = phone;
		this.email = email;
		this.role = role;
		this.salary = salary;
		this.increment_status = increment_status;
		this.security_clearance = security_clearance;
		this.location = location;
	}


	public Employee(String empId, int user_type, String name, Date dOJ, String password, String phone, String email,
			String role, Float salary, String increment_status, String security_clearance, String location) {
		super();
		this.empId = empId;
		this.user_type = user_type;
		this.name = name;
		this.DOJ = DOJ;
		this.password = password;
		this.phone = phone;
		this.email = email;
		this.role = role;
		this.salary = salary;
		this.increment_status = increment_status;
		this.security_clearance = security_clearance;
		this.location = location;
	}

    public Employee(int user_type, String taran, Date date, String root, String phone, String email, String systems_engineer, float salary, String good, String security_clearance, String hyderabad) {
    }


    public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public int getUser_type() {
		return user_type;
	}
	public void setUser_type(int user_type) {
		this.user_type = user_type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDOJ() {
		return DOJ;
	}
	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public String getIncrement_status() {
		return increment_status;
	}
	public void setIncrement_status(String increment_status) {
		this.increment_status = increment_status;
	}
	public String getSecurity_clearance() {
		return security_clearance;
	}
	public void setSecurity_clearance(String security_clearance) {
		this.security_clearance = security_clearance;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
