package com.Arrays;

public class Arrays {
	
	public static void main(String[] args) {
		
		int a[]=new int[6];
		
		a[0]=3;
		a[1]=6;
		a[2]=9;
		a[3]=12;
		a[4]=15;
		a[5]=18;
		
		//for (int i = 0; i < a.length; i++) {
			//System.out.println(a[i]);
		//}
		
		for (int i : a) {
			System.out.println(i);
		}
		
	}

}
