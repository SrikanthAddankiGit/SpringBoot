package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.Service.VehicleServiceImpl;
import com.app.model.Vehicle;

@RestController

@CrossOrigin("*")
public class VehicleController {

	@Autowired
	private VehicleServiceImpl service;

	@PostMapping(value = "/save")
	public Vehicle saveVehicle(@RequestBody Vehicle vehicle) {

		return service.saveVehicle(vehicle);
	}
	
	@PutMapping(value="/update")
	public Vehicle updateVehicle(@RequestBody Vehicle vehicle) {
		
		return service.updateVehicle(vehicle);
	}
	
	@GetMapping(value = "/findall")
	public List<Vehicle> findAll() {
		
		return service.findAll();
	}

	@DeleteMapping(value = "/delete")
	public String delete(int id) {
		service.delete(id);
		return "Deleted successfully...";
	}

}
