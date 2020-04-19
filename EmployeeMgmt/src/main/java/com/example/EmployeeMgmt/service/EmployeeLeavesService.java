package com.example.EmployeeMgmt.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeMgmt.model.EmployeeLeaves;
import com.example.EmployeeMgmt.repository.EmployeeLeavesRepository;

@Service
public class EmployeeLeavesService {

	@Autowired
	EmployeeLeavesRepository elr;
	public  Optional<EmployeeLeaves> viewLeaveStatus(String empId) {
		// TODO Auto-generated method stub
		return elr.findById(empId);
	}

}
