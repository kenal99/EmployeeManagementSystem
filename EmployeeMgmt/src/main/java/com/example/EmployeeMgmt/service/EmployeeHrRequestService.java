package com.example.EmployeeMgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeMgmt.model.EmployeeHrRequest;
import com.example.EmployeeMgmt.repository.EmployeeHrRequestRepository;

@Service
public class EmployeeHrRequestService {

	@Autowired
	EmployeeHrRequestRepository ehrr;
	
	public void addEmailPhone(EmployeeHrRequest emp) {
		// TODO Auto-generated method stub
			ehrr.save(emp);
		
	}

	
}
