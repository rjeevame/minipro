package com.Switch;

import java.util.Scanner;

public class Library_Book {
	
	public static void main(String[] args) {
		
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the book Number");
	
	int a = s.nextInt();
	
	int i=a;
	
	switch (i) {
	case 10:
		System.out.println("Engineering Physics");
		break;
	case 20:
		System.out.println("Engineering Chemistry");
		break;
	case 30:
		System.out.println("Engineering Mathematics");
		break;
	default:
		System.out.println("No book available for the entered Number");
		break;
	}
	
	s.close();
	}
}
