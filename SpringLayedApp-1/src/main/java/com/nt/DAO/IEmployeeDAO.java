package com.nt.DAO;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeDAO {
	public List<Employee> getEmpDesg(String job1,String job2,String job3) throws Exception;
}
