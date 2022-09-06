package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.Service.TeacherService;
import com.app.entity.StudentMarks;
import com.app.entity.Teacher;

@RestController
@RequestMapping
public class TeacherController {

	@Autowired
	private TeacherService marksService;
	
	@Autowired
	private StudentMarks studentMarks;

	/*
	 * @GetMapping("/display") public StudentMarks getStudentMarks() { return
	 * marksService.getStudentMarks(); }
	 */

	@GetMapping("/students")
	public Iterable<Teacher> displayMarks() {
		return marksService.displayMarks();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/students")
	public void updateMarks(@RequestBody StudentMarks studentMarks, @RequestBody Teacher teacher, @PathVariable int studentId) {
		teacher.setStudentMarks(studentId,studentMarks.getName(),studentMarks.getMaths(),studentMarks.getChemistry(),studentMarks.getPhysics(),studentMarks.getAverage(),studentMarks.getGrade(),studentMarks.getGrade());
		marksService.updateMarks(teacher);
	}
	/*
	 * @RequestMapping() public List<Teacher> findByTopicId(int id){ return
	 * marksService.findByTopicId(id); }
	 */
	/*
	 * @GetMapping("/display") public Iterable<StudentMarks> displayMarks(){ return
	 * marksService.displayMarks(); }
	 * 
	 * @RequestMapping(method=RequestMethod.POST,value="/displayVal") public void
	 * updateMarks(@RequestBody StudentMarks studentMarks) {
	 * marksService.updateMarks(studentMarks); }
	 */
}
