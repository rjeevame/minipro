package com.Method_Overriding;

public class Form1 extends Infosys_Drive{
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
	@Override
	public void application_Form(String Currently_Working_In, double Year_Of_Experience_In_Month) {
		super.application_Form(Currently_Working_In, Year_Of_Experience_In_Month);
	}
	public static void main(String[] args) {
		Form1 a=new Form1();
		a.application_Form("JEEVA", 'R');
		a.application_Form("RADHAKRISHNAN", "Chennai");
		a.application_Form("9600446975l", "rjeevame@gmail.com");
		a.application_Form("BE-MECH", "8.23f");
		a.application_Form("SRM", "2015");
		a.application_Form("SoftWare Testing", "8LPA");
		a.application_Form("TCS", "2.6");
	}
}
