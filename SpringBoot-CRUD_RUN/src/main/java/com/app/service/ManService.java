package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Man;
import com.app.repository.ManRepository;

@Service
public class ManService implements IManService{
	
	@Autowired
	private ManRepository repo;
	
	public List<Man> getValues(Man man) {
		return (List<Man>) repo.save(man);
		
	}

	
	
	
}
