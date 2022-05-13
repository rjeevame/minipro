package com.String_Function;

public class String_Function2 {
	
	public static void main(String[] args) {
		String s= "change the world by being yourself";
		String s1= "Change The World by Being Yourself";
		String s2="";
		
		int length = s.length();                //s.lenght()
		System.out.println(length);
		
		boolean equals = s.equals(s1);          //s.equals()
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);  //s.equalsIgnoreCase()
		System.out.println(equalsIgnoreCase);
		
		String upperCase = s.toUpperCase();     //s.toUpperCase()
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();     //s.toLowerCase()
		System.out.println(lowerCase);
		
		boolean startsWith = s1.startsWith("C"); //s.startswith()
		System.out.println(startsWith);
		
		boolean endsWith = s1.endsWith("e");    //s.endswith()
		System.out.println(endsWith);
		
		boolean contains = s.contains("by");	//s.contains()
		System.out.println(contains);
		
		int indexOf = s1.indexOf("e");			//s.indexOf()
		System.out.println(indexOf);
	}
}
