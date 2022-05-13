package com.loop;

import java.util.Scanner;

public class Armstrong_Number {

public static void main(String[] args) {
	
	int rem=0;
	int ans=0;
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter your number");
	int n = s.nextInt();
	System.out.println(n);
	
	int a=n;
	
while (n>0) {
	
	rem=n%10;
	ans=ans+(rem*rem*rem*rem);
	n=n/10;
}	
if (a==ans) {
	System.out.println("Given number is Armstrong Number");
} else {
	System.out.println("Given NUmber is not Armstrong Number");

}

s.close();
}
	
}
