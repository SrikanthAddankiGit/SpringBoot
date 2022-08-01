package com.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.model.Student;


@Controller
public class StudentController {
	
	@GetMapping("/index")
	public String getForm(@RequestBody Model model) {
		model.addAttribute("Student", new Student());
		
		return "index";
	}
}
