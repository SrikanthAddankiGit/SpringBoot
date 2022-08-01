package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.model.Man;
import com.app.service.ManService;

@Controller
@ResponseBody
public class ManController {
	
	@Autowired
	private ManService service;
	
	@GetMapping("/value")
	public List<Man> getValues(Man man) {
		return (List<Man>) service.getValues(man);
		
	}
}
