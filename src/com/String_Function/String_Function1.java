package com.String_Function;

public class String_Function1 {

	
	public static void main(String[] args) {
		String s= "change the world by being yourself";
		String s1= "    Change The World by Being Yourself  ";
		String s2="";
		
		int lastIndexOf = s.lastIndexOf("e");		//s.lastIndexOf()
		System.out.println(lastIndexOf);
		
		char charAt = s.charAt(30);					//s.charAt()
		System.out.println(charAt);
		
		String replace = s.replace('e', 'E');		//s.replace()
		System.out.println(replace);
		
		String substring = s1.substring(7);
		System.out.println(substring);				//s.subString()
		
		boolean empty = s2.isEmpty();
		System.out.println(empty);					//s.isempty()
		
		String trim = s1.trim();
		System.out.println(trim);					//s.trim()
		
		int compareTo = s1.compareTo(s2);			//s.compareTo()
		System.out.println(compareTo);
		
		String[] split = s.split("b");				//s.split()
		for (String string : split) {
			System.out.print(string);
		}
	}
}
