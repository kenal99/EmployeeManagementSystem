package com.example.EmployeeMgmt.repository;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.EmployeeMgmt.model.EmployeeNotice;

public interface EmployeeNoticeRepository extends MongoRepository<EmployeeNotice, String> {

	ArrayList<EmployeeNotice> getEmpMsgById(String empId);


}
