package com.Method_Overriding;

public class Infosys_Drive {

	
	public void application_Form(String First_Name, char Initial) {
		System.out.println(First_Name + "  "+ Initial);
	}
	
	public void application_Form(String Father_Name,String Address) {
		System.out.println(Father_Name+"   "+ Address);
	}
	
	public void application_Form(long MobileNo, String Email_Id) {
		System.out.println(MobileNo + "    "+ Email_Id);
	}
	
	public void application_Form(String Qualification_with_Stream, float Overall_CGPA) {
		System.out.println(Qualification_with_Stream+"    "+ Overall_CGPA);
	}
	
	public void application_Form(String College_Name, short Year_of_Passing) {
		System.out.println(College_Name+"    "+ Year_of_Passing);
	}
	
	public void application_Form(String Apply_For,int Expected_Salary) {
		System.out.println(Apply_For+"   "+ Expected_Salary);
	}
	
	public void application_Form(String Currently_Working_In, double Year_Of_Experience_In_Month) {
		System.out.println(Currently_Working_In+"      "+ Year_Of_Experience_In_Month);
	}
}
