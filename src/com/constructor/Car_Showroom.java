package com.constructor;

public class Car_Showroom {
	
	public Car_Showroom() {
		System.out.println("NEXA");
	}
	
	public Car_Showroom(String Cars_Company_Name,String Location) {
		System.out.println(Cars_Company_Name+ "   "+ Location);
	}
	
	public Car_Showroom(byte NoOfEmployers, byte NoOfCar_Model) {
		System.out.println(NoOfEmployers+"  "+ NoOfCar_Model);
	}
	
	public Car_Showroom(int Lowest_Price_Of_Car, int Highest_Price_Of_Cars) {
		System.out.println(Lowest_Price_Of_Car+ "    "+ Highest_Price_Of_Cars);
	}
	public Car_Showroom(String Model1, int Model1_Price) {
		System.out.println(Model1+  "    "+ Model1_Price);
	}
	
	public Car_Showroom(String Model2, long Model2_Price) {
		System.out.println(Model2+"    "+ Model2_Price);
}
	public static void main(String[] args) {
		
		Car_Showroom c= new Car_Showroom();
		Car_Showroom c1=new Car_Showroom("Maruti Suzuki", "Chennai");
		Car_Showroom c2=new Car_Showroom(20, 6);
		Car_Showroom c3=new Car_Showroom(525000,1014000);
		Car_Showroom c4=new Car_Showroom("IGNIS", 525000);
		Car_Showroom c5=new Car_Showroom("Ciaz", 885000);
	}
	
}
