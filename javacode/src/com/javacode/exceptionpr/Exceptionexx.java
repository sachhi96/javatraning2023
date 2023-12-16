package com.javacode.exceptionpr;

public class Exceptionexx {
	public static void main(String[] args) {
		try {
			int x = 4 / 0;
			System.out.println(x);
		} catch (ArithmeticException e) {
			System.out.println("not accepted " + e);
		}
	}
}
