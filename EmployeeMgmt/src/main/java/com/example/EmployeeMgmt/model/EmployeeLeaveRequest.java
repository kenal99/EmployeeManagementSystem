package com.example.EmployeeMgmt.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "EmployeeLeaveRequest")
public class EmployeeLeaveRequest {

	@Id
	String leaveID;
	String fromEmpID;
	String toHRID; 
	int leave_req_days;
	public EmployeeLeaveRequest(String leaveID, String fromEmpID, String toHRID, int leave_req_days) {
		super();
		this.leaveID = leaveID;
		this.fromEmpID = fromEmpID;
		this.toHRID = toHRID;
		this.leave_req_days = leave_req_days;
	}
	public String getLeaveID() {
		return leaveID;
	}
	public void setLeaveID(String leaveID) {
		this.leaveID = leaveID;
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
	public int getLeave_req_days() {
		return leave_req_days;
	}
	public void setLeave_req_days(int leave_req_days) {
		this.leave_req_days = leave_req_days;
	}
	
	

}
