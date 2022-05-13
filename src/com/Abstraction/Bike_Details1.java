package com.Abstraction;

public abstract class Bike_Details1 {
	
	// Non-Abstract method
	
	public void company_Name() {
		System.out.println("Honda");
	}
	public void bike_Type() {
		System.out.println("E-Bike");
	}
	public void cubic_Capacity() {
		System.out.println("150cc");
	}
	public void starting() {
		System.out.println("Self start only");
	}
	
	
	//Abstract method
	
	public abstract void price();
	public abstract void motor_Power();
	public abstract void speedometer();
	

	

	
	
	

}
