package com.Method_Overriding;

public class Form2 extends Infosys_Drive{

	@Override
	public void application_Form(String First_Name, char Initial) {
		super.application_Form(First_Name, Initial);
	}
	@Override
	public void application_Form(String Father_Name, String Address) {
		super.application_Form(Father_Name, Address);
	}
	@Override
	public void application_Form(long MobileNo, String Email_Id) {
		super.application_Form(MobileNo, Email_Id);
	}
	@Override
	public void application_Form(String Qualification_with_Stream, float Overall_CGPA) {
		super.application_Form(Qualification_with_Stream, Overall_CGPA);
	}
	@Override
	public void application_Form(String College_Name, short Year_of_Passing) {
		super.application_Form(College_Name, Year_of_Passing);
	}
	@Override
	public void application_Form(String Apply_For, int Expected_Salary) {
		super.application_Form(Apply_For, Expected_Salary);
	}
	public static void main(String[] args) {
		Form2 b = new Form2();
		b.application_Form("SURESH", 'K');
		b.application_Form("Kishore", "Kanchipuram");
		b.application_Form("8610724816l","sureshk@gmail.com");
		b.application_Form("BE-CSE", "8.56f");
		b.application_Form("VIT", "2015");
		b.application_Form("Java Developer", "12LPA");
		
	}
}
