package com.Scanner;

import java.util.Scanner;

public class Sbi_App {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		System.out.println("Enter your account no:");
		long accountNo = S.nextLong();
		System.out.println(accountNo);
		
		System.out.println("Enter your First name;");
		String FirstName =S.next();
		System.out.println(FirstName);
		
		System.out.println("Enter your Last name:");
		String LastName =S.next();
		System.out.println(LastName);
		
		System.out.println("Enter your Mobile Number:");
		long mobileNo = S.nextLong();
		System.out.println(mobileNo);
		
		System.out.println("IFSC Code");
		String IFSCcode = S.next();
		System.out.println(IFSCcode);
		
		System.out.println("Create new pin Number");
		int pinno = S.nextInt();
		System.out.println(pinno);
		
		S.close();
		
	}
}

