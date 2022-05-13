package com.Extension;


public class Array_Extension {
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		try {
			String s = "Jeeva";
			char charAt = s.charAt(5);
			System.out.println(charAt);
			int c=a/b;
		} 
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
					}
		catch (Exception e) {
System.out.println("error");		
}
	
		finally {
			
			System.out.println("Exception");
		}
	
	}
}
	
	
			
	
		
	
	

