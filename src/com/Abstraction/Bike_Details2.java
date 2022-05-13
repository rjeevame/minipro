package com.Abstraction;

public class Bike_Details2 extends Bike_Details1{

	@Override
	public void price() {
		System.out.println("Rs.1,00,000");
	}

	@Override
	public void motor_Power() {
		System.out.println("4000Kw");
	}

	@Override
	public void speedometer() {
		System.out.println("Digital");
	}

public static void main(String[] args) {

	Bike_Details2 b = new Bike_Details2();
	b.company_Name();
	b.cubic_Capacity();
	b.bike_Type();
	b.starting();
	b.motor_Power();
	b.price();
	b.speedometer();
}	
	

}
