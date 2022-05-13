package com.loop;

public class For_Loop {

	//FIBONACCI SERIES
	
	public static void main(String[] args) {
		
		
		int F1=0;
		int F2=1;
		int F3;
		
		System.out.println("     "+F1);
		System.out.println("     "+F2);
		
		for (int i = 0; i <15; i++) {
			
			F3=F1+F2;
		System.out.println(i+"    "+F3);	
		
		F1=F2;
		F2=F3;
			
			
		}
	}
}
