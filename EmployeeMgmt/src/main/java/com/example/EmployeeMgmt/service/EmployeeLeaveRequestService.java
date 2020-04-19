package com.example.EmployeeMgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeMgmt.model.EmployeeLeaveRequest;
import com.example.EmployeeMgmt.repository.EmployeeLeaveRequestRepository;

@Service
public class EmployeeLeaveRequestService {
	
	@Autowired
	EmployeeLeaveRequestRepository elrr;

	public void requestLeave(EmployeeLeaveRequest elr) {
		// TODO Auto-generated method stub
		elrr.save(elr);
	}

}
