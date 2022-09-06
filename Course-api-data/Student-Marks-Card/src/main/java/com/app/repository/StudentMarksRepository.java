package com.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.StudentMarks;



@Repository
public interface StudentMarksRepository extends CrudRepository<StudentMarks,Integer>{

}
