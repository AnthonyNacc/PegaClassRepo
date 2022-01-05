package com.revature;

import java.util.Scanner;

public class Q06 {
	
	public static void main (String []args) {
		
		System.out.println("Enter number: ");
		Scanner scanner= new Scanner (System.in);
		int number=scanner.nextInt();
		
		int result = (number/2)*2;
		if (result ==number) {
			System.out.println("Given number is even");
		}
		else {
			System.out.println("Given Number is odd");
		}
	}

}
