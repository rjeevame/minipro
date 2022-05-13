package com.String_Function;
public class String_Function {
	public static void main(String[] args) {
		String s= "change the world by being yourself";
		String s1= "Change The World by Being Yourself";
		String s2="";
		
		String[] split = s.split("b");
		for (String string : split) {
			System.out.print(string);
		}
		System.out.println();
		int length = s.length();
		System.out.println(length);
		boolean equals = s.equals(s1);
		System.out.println(equals);
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase);
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		boolean startsWith = s1.startsWith("C");
		System.out.println(startsWith);
		boolean endsWith = s1.endsWith("e");
		System.out.println(endsWith);
		boolean contains = s.contains("by");
		System.out.println(contains);
		int indexOf = s1.indexOf("e");
		System.out.println(indexOf);
		int lastIndexOf = s.lastIndexOf("e");
		System.out.println(lastIndexOf);
		char charAt = s.charAt(30);
		System.out.println(charAt);
		String replace = s.replace('e', 'E');
		System.out.println(replace);
		String substring = s1.substring(7);
		System.out.println(substring);
	}
}
