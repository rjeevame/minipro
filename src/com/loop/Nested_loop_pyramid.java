package com.loop;

public class Nested_loop_pyramid {
	
	public static void main(String[] args) {
		
		for (int i = 0; i <=5; i++) {
			for (int j = i; j <=5; j++) {
				
				System.out.print("  ");
			}
			
			for (int k = 1; k < i+1; k++) {
				
				System.out.print("  "+ "*");
			}
			System.out.println( );
		}
	}

}
