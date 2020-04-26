package com.example.EmployeeMgmt.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.EmployeeMgmt.model.Employee;
import com.example.EmployeeMgmt.model.EmployeeLeaves;

public interface EmployeeLeavesRepository extends MongoRepository<EmployeeLeaves,Integer>{

    void deleteById(String empId);

    Optional<EmployeeLeaves> findById(String empId);
}
