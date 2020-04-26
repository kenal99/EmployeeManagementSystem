package com.example.EmployeeMgmt.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "EmployeeHrRequest")
public class EmployeeHrRequest {

	@Id
	String entryID; 
	String fromEmpID;
	String toHRID;
	String phone;
	String email;
	public EmployeeHrRequest(String entryID, String fromEmpID, String toHRID, String phone, String email) {
		super();
		this.entryID = entryID;
		this.fromEmpID = fromEmpID;
		this.toHRID = toHRID;
		this.phone = phone;
		this.email = email;
	}
	@Override
	public String toString() {
		return "EmployeeHrRequest [entryID=" + entryID + ", fromEmpID=" + fromEmpID + ", toHRID=" + toHRID + ", phone="
				+ phone + ", email=" + email + "]";
	}
	public String getEntryID() {
		return entryID;
	}
	public void setEntryID(String entryID) {
		this.entryID = entryID;
	}
	public String getFromEmpID() {
		return fromEmpID;
	}
	public void setFromEmpID(String fromEmpID) {
		this.fromEmpID = fromEmpID;
	}
	public String getToHRID() {
		return toHRID;
	}
	public void setToHRID(String toHRID) {
		this.toHRID = toHRID;
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
	
	

}
