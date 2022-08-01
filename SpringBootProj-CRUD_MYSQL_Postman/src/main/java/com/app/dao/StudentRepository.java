package com.app.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.app.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
