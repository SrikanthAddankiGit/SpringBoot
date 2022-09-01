package com.app.dao;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public interface StudentDAO {

	public Map<String,Object>  getStudentData();

}
