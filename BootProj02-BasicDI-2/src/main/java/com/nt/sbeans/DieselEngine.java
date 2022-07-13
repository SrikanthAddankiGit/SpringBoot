package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("Dengine")
public class DieselEngine implements IEngine {
	
	public DieselEngine() {
		System.out.println("DieselEngine.DieselEngine()");
	}
	@Override
	public void start() {
		System.out.println("DieselEngine.start()");
	}
	@Override
	public void stop() {
		System.out.println("DieselEngine.stop()");
	}
	
}
