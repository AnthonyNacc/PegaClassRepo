package com.revature;


public class Q10 {

	public static void main (String []args) {
		// Declaring Variables
		int n1 = 5, n2 = 10, min;
		
		System.out.println("First number: " + n1 );
		System.out.println("Second number: " + n2 );
		
		// Smallest among the two values
		min = (n1 < n2) ? n1 : n2;
		
		// print the smaller number 
		System.out.println("The Minimum is = " + min);
	}
	
}
