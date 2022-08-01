package com.app.Service;

import java.util.List;

import com.app.model.Vehicle;

public interface IVehicleService {
	
	public Vehicle saveVehicle(Vehicle vehicle);
	
	public Vehicle updateVehicle(Vehicle vehicle);
	
	public List<Vehicle> findAll();
	
	public String delete(int id);
}
