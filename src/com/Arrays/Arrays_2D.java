package com.Arrays;

public class Arrays_2D {
	
	public static void main(String[] args) {
		
		int a[][]=new int [4][4];
		
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=6;
		a[0][3]=8;
		a[1][0]=3;
		a[1][1]=6;
		a[1][2]=9;
		a[1][3]=12;
		a[2][0]=4;
		a[2][1]=8;
		a[2][2]=2;
		a[2][3]=6;
		a[3][0]=5;
		a[3][1]=0;
		a[3][2]=5;
		a[3][3]=10;
		
		for (int i = 0; i <4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(a[i][j]+"    ");
			}
			System.out.println();
		}
				
	}

}
