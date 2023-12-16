package com.javacode.expction;

public class Expectionhandelingnew {
	public static void main(String[] args) throws Userdefineexpectionnew {
		try {
			int x = 4 / 0;
			System.out.println(x);
		} catch (ArithmeticException e) {
			System.out.println("not accepted " + e);
		}
	}
}
