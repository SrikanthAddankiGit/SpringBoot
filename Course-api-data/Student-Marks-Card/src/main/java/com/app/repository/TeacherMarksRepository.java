package com.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.StudentMarks;
import com.app.entity.Teacher;

@Repository
public interface TeacherMarksRepository extends CrudRepository<Teacher, Integer> {

	Iterable<Teacher> save(StudentMarks studentMarks);

}
