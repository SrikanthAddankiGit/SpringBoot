package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String GET_EMPS_BY_DESGS="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";
	
	@Autowired
	private IEmployeeDAO ds;

	@Override
	public List<Employee> getEmpDesg(String job1, String job2, String job3) throws Exception {
		
		System.out.println("EmployeeDAOImpl.getEmpDesg()"+getClass());
		List<Employee> list = null;
		
		 try(Connection con = ((Statement) ds).getConnection();
				PreparedStatement ps = con.prepareStatement(GET_EMPS_BY_DESGS)){
			ps.setString(1,job1);
			ps.setString(2,job2);
			ps.setString(3,job3);
			
			try(ResultSet rs = ps.executeQuery()){
				list = new ArrayList<Employee>();
				while(rs.next()) {
					Employee emp=new Employee();
		    		 emp.setEMPNO(rs.getInt(1));
		    		 emp.setENAME(rs.getString(2));
		    		 emp.setJOB(rs.getString(3));
		    		 emp.setSAL(rs.getDouble(4));
		    		 emp.setDEPTNO(rs.getInt(5));
		    		 list.add(emp);
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
			
		
		return list;
	}

}
