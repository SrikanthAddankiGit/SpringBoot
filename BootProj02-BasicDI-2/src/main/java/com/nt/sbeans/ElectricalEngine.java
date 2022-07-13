package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("Eengine")
public class ElectricalEngine implements IEngine {
	public ElectricalEngine() {
		System.out.println("ElectricalEngine.ElectricalEngine()");
	}
	@Override
	public void start() {
		System.out.println("ElectricalEngine.start()");
	}
	@Override
	public void stop() {
		System.out.println("ElectricalEngine.stop()");
	}
}
