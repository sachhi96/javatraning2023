package com.javacode.piller;

public class Child extends Parent {
	public void car() {
System.out.println("paps perporty");
	}

	public static void main(String[] args) {//multilevel inheritance
		Child c = new Child();
		c.house();
		c.money();
		c.car();
		c.land();

	}
}
