package com.revature;
import java.util.ArrayList;
import java.util.Collections;

public class Q08 {
	public static void main(String args[]) {
		ArrayList<String>
		list = new ArrayList<String>();
		
		// Make List
		
		list.add("karan");
		list.add("madam");
		list.add("tom");
		list.add("civic");
		list.add("radar");
		list.add("jimmy");
		list.add("kayak");
		list.add("john");
		list.add("refer");
		list.add("billy");
		list.add("did");
		
		Collections.sort(list);
		
		System.out.println("Sorrted Arraylist " + list);
		
		list = new ArrayList<String>();
		
		list.add("madam");
		list.add("civic");
		list.add("radar");
		list.add("kayak");
		list.add("refer");
		list.add("did");

		System.out.println("Palindrome Arraylist " + list);
	}
	

}
