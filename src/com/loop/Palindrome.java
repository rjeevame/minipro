package com.loop;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int rem=0;
		int ans=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Palindrome Number");
		int n = s.nextInt();
		System.out.println(n);
		
		int a=n;
		while (n>0) {
			
			rem=n%10;
			ans=ans*10+rem;
			n=n/10;
		}
		
		if (a==ans) {
			System.out.println("Entered number is Palindrome Number");
		} else {
			System.out.println("Enteres number is not palindrome Number");
		}
		s.close();
	}

}
