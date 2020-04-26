 package com.example.EmployeeMgmt.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "EmployeeNotice")
public class EmployeeNotice {

	//@Transient
    public static final String SEQUENCE_NAME = "emp_notice_sequence";

	public EmployeeNotice() {

	}

	@Override
	public String toString() {
		return "EmpNoticeTemp [id=" + id + ", from=" + from + ", to=" + empId + ", message=" + message + "]";
	}
	@Id
	String id;
	String from;
	String empId;
	String message;

	public String getTo() {
		return empId;
	}

	public void setTo(String to) {
		this.empId = to;
	}

	public EmployeeNotice(String from, String to) {
		super();
		this.from = from;
		this.empId =to;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
