package com.app.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.CountryDaoImpl;

@RestController
public class CountryController {
	
	@Autowired
	private CountryDaoImpl daoImpl;
	
	@GetMapping("/hello")
	public Map<String,Object> sayHello(){
		return daoImpl.execute();
		
		
	}
}
