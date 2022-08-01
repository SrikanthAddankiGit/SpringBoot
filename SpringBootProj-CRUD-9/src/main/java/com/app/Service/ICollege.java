package com.app.Service;

import java.util.List;

import com.app.Model.College;

public interface ICollege {
	
	public College saveCollege(College college);
	
	public College updateCollege(College college);
	
	public List<College> findAll();
	
	public String DeleteCollege(int id);
}
