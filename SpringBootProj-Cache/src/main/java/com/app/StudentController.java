package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StudentController {

	@GetMapping("/studentWithoutCache")
	public Student showWithoutCache() {
		System.out.println("StudentController.showWithoutCache()");

		return new Student(3429, "Srikanth addanki");
	}

	@Bean
	@GetMapping("/studentWithoutCache1")
	public Student showWithoutCache1() {
		System.out.println("StudentController.showWithoutCache()");

		return new Student(1, "Srikanth");
	}

	@GetMapping("/studentWithCache")
	@Cacheable(value = "cacheStudent")
	public Student showWithCache() {
		System.out.println("StudentController.showWithCache()");

		return new Student(3429, "Srikanth with cache");
	}

	@GetMapping("/remove")
	@CacheEvict(value = "cacheStudent", allEntries = true)
	public Student removeCache() {
		System.out.println("StudentController.removeCache()");

		return new Student(2, "Mohan");
	}

}
