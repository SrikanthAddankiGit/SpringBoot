package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class AppController {

	@GetMapping("/done")
	public String getValue() {

		List<String> val1 = new ArrayList<>();
		int marks1 = 80;
		int marks2 = 95;
		int marks3 = 50;
		double tot = marks1 + marks2 + marks3;
		double per = tot / 3;
		String grade;
		if (marks1 >= 40 & marks2 >= 40 & marks3 >= 40) {
			grade = "Pass";
			val1.add("Srikanth");
		} else {
			grade = "Faill";
		}

		return val1+"your grade is "+grade+" and your percentage is "+per;
	}
}
