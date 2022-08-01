package com.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Vehicle;
import com.app.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements IVehicleService{
	
	@Autowired
	private VehicleRepository repo;
	
	
	@Override
	public Vehicle saveVehicle(Vehicle vehicle) {
		
		return repo.save(vehicle);
	}

	@Override
	public Vehicle updateVehicle(Vehicle vehicle) {
		
		return repo.save(vehicle);
	}

	@Override
	public List<Vehicle> findAll() {
		
		return repo.findAll();
	}

	@Override
	public String delete(int id) {
		repo.deleteById(id);
		return "Deleted successfully...";
	}

}
