package com.example.EmployeeMgmt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.EmployeeMgmt.model.EmployeeHrRequest;
import com.example.EmployeeMgmt.model.EmployeeLeaves;

public interface EmployeeHrRequestRepository extends MongoRepository<EmployeeHrRequest, String> {

}
