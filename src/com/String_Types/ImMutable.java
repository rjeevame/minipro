package com.String_Types;

public class ImMutable {
	
	public static void main(String[] args) {
		
		
		String s = "string types";
		String s1 = "string types";
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
		s=s+s1;
		System.out.println(s);
		
		System.out.println(System.identityHashCode(s));
	}

}
