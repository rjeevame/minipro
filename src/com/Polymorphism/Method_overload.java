package com.Polymorphism;

public class Method_overload {
	
	public void application_Details(String First_Name, char Last_Name) {
		System.out.println(First_Name + Last_Name);	
	}
	public void application_Details(String Father_Name, byte age) {
		System.out.println(Father_Name+ "  "+age);
	}
	public void application_Details(String gender, long Mobile_Number) {
		System.out.println(gender+"    "+ Mobile_Number);
	}
	public void application_Details(String Qualification, String Pan_Number) {
		System.out.println(Qualification+"     "+ Pan_Number);
	}
	public void application_Details(long Aadhar_Number, long Bank_Account_No) {
		System.out.println(Aadhar_Number+"   "+Bank_Account_No);
	}
	public void application_Details(float height, double weight) {
			System.out.println(height+"   "+ weight);
	}
	public static void main(String[] args) {
		Method_overload m = new Method_overload();
			m.application_Details("JEEVA", "R");
			m.application_Details("RADHAKRISHNAN", "30");
			m.application_Details("Male", "9600446975");
			m.application_Details("Degree", "AYKP02654");
			m.application_Details("3215469874569", "5320789659");
			m.application_Details("157.05cm", "70.3697kg");
		
	}

}
