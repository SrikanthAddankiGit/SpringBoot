package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.DAO.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmployeeMgmtService implements IEmployeeDAO {
	
	@Autowired
	private IEmployeeDAO empDAO;

	@Override
	public List<Employee> getEmpDesg(String job1, String job2, String job3) throws Exception {
		System.out.println("EmployeeMgmtService.getEmpDesg()");
		
		List<Employee> list = empDAO.getEmpDesg(job1,job2,job3);
		return list;
	}

}
