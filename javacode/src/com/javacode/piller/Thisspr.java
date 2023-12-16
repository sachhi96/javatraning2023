package com.javacode.piller;

public class Thisspr {
	public Thisspr() {

		System.out.println("default");
		
	}
	public Thisspr(int a) {

	
	this();
		System.out.println("one param " + a);
		
	}
	public Thisspr(int a, int b) {

	this(5);
		System.out.println("two param " + a +" " + b );
	
	}
	public static void main(String[] args) {

		Thisspr b = new Thisspr(2,4);
		
	}

}

