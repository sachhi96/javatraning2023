package com.javacode.piller;

public class Car extends Vehical {
	public void engin() {
		System.out.println("power full engine");// herarical(vehical,tire,break)
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.breaks();
		c.engin();
		c.tire();
	}
}
