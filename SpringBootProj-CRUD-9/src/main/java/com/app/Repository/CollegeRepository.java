package com.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.Model.College;

@Repository
public interface CollegeRepository extends CrudRepository<College, Integer> {

}
