package com.revature;

public class Driver {
	/* Variable scope in Java:
	 * 1. Class scope (static methods and variables)
	 * 2. Instance scope (non-static methods and variables)
	 * 3. Method Scope
	 * 4. Block scope (any variable declared within {} that doesnt fall into another scope
	 */
	
	public static void main(String []args) {
		staticHelper();
		staticHelper();
		staticHelper();
		
		Animal a = new Animal();
		Animal.count++;
		a.species = "giraffe";
		
		Animal b = new Animal();
		Animal.count++;
		b.species= "tiger";
		
		System.out.println("Animal a: " + Animal.count + ", " + a.species );
		System.out.println("Animal b: " + Animal.count + ", " + b.species);

	}
	
	public static void staticHelper() {
		// This variable belongs to the METHOD scope
		// it only exists so long as the method is executing
		
		int methodInt = 0;
		++methodInt;
		
		System.out.println(methodInt);
		
	}

}

class Animal {
	
	// Because this int is static, it belongs to the CLASS scope
	static int count = 0;
	// non- static variables belong to the INSTANCE scope
	String species;
	
}