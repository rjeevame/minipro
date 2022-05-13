package com.condition_Statement;

import java.util.Scanner;

public class Else_If {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age");
		int age = s.nextInt();
		System.out.println(age);
		
		if (age<=5) {
			System.out.println("Child");
		}
		else if (age>=6 && age<=15) {
			System.out.println("Kids");
		}
		else if (age>=16 && age<=30) {
			System.out.println("Adult");
		}
		else if (age>=31 && age<=50) {
			System.out.println("Citizen");
		}
		else {
			System.out.println("Senior Citizen");
		}
			
		s.close();
	}

}
