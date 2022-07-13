package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("ptrl")
public class PetrolEngine implements IEngine {
	
	public PetrolEngine() {
		System.out.println("PetrolEngine.PetrolEngine()");
	}
	@Override
	public void start() {
		System.out.println("PetrolEngine.start()");
	}
	@Override
	public void stop() {
		System.out.println("PetrolEngine.stop()");
	}
}
