package com.app.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Man;

@Repository
public interface ManRepository extends CrudRepository<Man, Integer> {

}
