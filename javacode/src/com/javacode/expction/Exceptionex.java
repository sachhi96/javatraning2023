package com.javacode.expction;

public class Exceptionex {
	public static void main(String[] args) {
		try {
			int a = 50 / 0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println("you cannot divisble by zero" + e);
		}
		int b = 25 / 3;
		System.out.println(b);

	}
}
