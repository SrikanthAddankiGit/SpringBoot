package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

@Controller("payroll")
public class PayrollOperationsController {
	
	@Autowired
	private IEmployeeMgmtService service;
	
	public List<Employee>  showEmployeesByDesgs(String job1,String job2,String job3)throws Exception{
		System.out.println("PayrollOperationsController.showEmployeesByDesgs()");
		List<Employee> list = service.fetchEmployeesByDesgs(job1,job2,job3);
		return list;
	}
}
