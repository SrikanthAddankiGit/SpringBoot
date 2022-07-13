package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeMgmtService {
	public List<Employee> fetchEmployeesByDesgs(String job1,String job2,String job3);
}
