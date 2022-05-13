package com.String_Types;

public class mutable_StringBuffer {
	
	
	
	public static void main(String[] args) {
		
		StringBuffer s =new StringBuffer("string Types");
		StringBuffer s1=new StringBuffer("String Types");
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
		s.append(s1);
		
		System.out.println(s);
		
		System.out.println(System.identityHashCode(s));
	}

}
