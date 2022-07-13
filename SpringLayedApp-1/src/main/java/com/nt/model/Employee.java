package com.nt.model;

import lombok.Data;

@Data
public class Employee {
	private Integer EMPNO;
	private String ENAME;
	private String JOB;
	private Double SAL;
	private Integer DEPTNO;
	public void setEMPNO(Integer eMPNO) {
		EMPNO = eMPNO;
	}
	public void setENAME(String eNAME) {
		ENAME = eNAME;
	}
	public void setJOB(String jOB) {
		JOB = jOB;
	}
	public void setSAL(Double sAL) {
		SAL = sAL;
	}
	public void setDEPTNO(Integer dEPTNO) {
		DEPTNO = dEPTNO;
	}
	public Integer getEMPNO() {
		return EMPNO;
	}
	public String getENAME() {
		return ENAME;
	}
	public String getJOB() {
		return JOB;
	}
	public Double getSAL() {
		return SAL;
	}
	public Integer getDEPTNO() {
		return DEPTNO;
	}
	@Override
	public String toString() {
		return "Employee [EMPNO=" + EMPNO + ", ENAME=" + ENAME + ", JOB=" + JOB + ", SAL=" + SAL + ", DEPTNO=" + DEPTNO
				+ "]";
	}
	
	
}
