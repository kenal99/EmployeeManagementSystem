package com.example.EmployeeMgmt.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeMgmt.model.Employee;
import com.example.EmployeeMgmt.model.EmployeeHrRequest;
import com.example.EmployeeMgmt.model.EmployeeLeaveRequest;
import com.example.EmployeeMgmt.model.EmployeeLeaves;
import com.example.EmployeeMgmt.model.EmployeeNotice;
import com.example.EmployeeMgmt.repository.EmployeeLeavesRepository;
import com.example.EmployeeMgmt.repository.EmployeeNoticeRepository;
import com.example.EmployeeMgmt.repository.EmployeeRepository;
import com.example.EmployeeMgmt.service.EmployeeHrRequestService;
import com.example.EmployeeMgmt.service.EmployeeLeaveRequestService;
import com.example.EmployeeMgmt.service.EmployeeLeavesService;
import com.example.EmployeeMgmt.service.EmployeeNoticeService;
import com.example.EmployeeMgmt.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService es;
	
	@Autowired
	EmployeeLeavesService els;
	
	@Autowired
	EmployeeNoticeService ens;
	
	@Autowired
	EmployeeHrRequestService ehrs;
	
	@Autowired
	EmployeeLeaveRequestService elrs;
	

		
	
	
	//Change Password
	@PutMapping("/changePassword/{empId}/{pass}")
	public void changeEmpPassword(@PathVariable("empId") String empId,@PathVariable("pass") String pass) {
		es.changeEmpPassword(empId,pass);
	}
	
	//request to Add email and phone
	@PostMapping("/addEmailAndPhone/")
	public void addEmailPhone(@RequestBody EmployeeHrRequest emp) {
		ehrs.addEmailPhone(emp);
	}

	//Request for leave
	@PostMapping("/requestLeave/")
	public void requestLeave(@RequestBody EmployeeLeaveRequest elr) {
		elrs.requestLeave(elr);
	}
		
	//View Employee Profile
	@GetMapping("/viewProfile/{empId}")
	public Optional<Employee> getEmployee(@PathVariable("empId") String empId){
		return es.getEmployee(empId);
	}
	
	//View Incremental Status
	@GetMapping("/viewIncrementalStatus/{empId}")
	public String viewIncrementalStatus(@PathVariable("empId") String empId) {
		return es.viewIncrementalStatus(empId);
	}
	
	//View Leave Status
	@GetMapping("/viewLeaveStatus/{empId}")
	public Optional<EmployeeLeaves> viewLeaveStatus(@PathVariable("empId") String empId) {
		return els.viewLeaveStatus(empId);
	}
	
	//View Employee Message
	@GetMapping("/viewEmpMsg/{empId}")
	public ArrayList<EmployeeNotice> viewEmpMsg(@PathVariable("empId") String empId){
		return ens.viewEmpMsg(empId);
	}
	
	
	
	
}
