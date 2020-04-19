package com.example.EmployeeMgmt.repository;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.EmployeeMgmt.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {


	Employee findByEmpId(String empId);

	
}
