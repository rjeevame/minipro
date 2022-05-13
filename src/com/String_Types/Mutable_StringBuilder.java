package com.String_Types;

public class Mutable_StringBuilder {
	
	public static void main(String[] args) {
		
		StringBuilder s =new StringBuilder("Mutable String Builder");
		StringBuilder s1 =new StringBuilder("mutable String Builder");
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
		s1.append(s);
		
		System.out.println(s1);
		
		System.out.println(System.identityHashCode(s1));
	}

}
