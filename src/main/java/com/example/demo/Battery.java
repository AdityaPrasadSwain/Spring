package com.example.demo;

public class Battery {
	private Bike bi;
	
	
		
	public Battery(Bike bi) {
		super();
		this.bi = bi;
	}


	

	
	public void charge() {
		System.out.println("battery charged");
		bi.drive();
	}
	
}
