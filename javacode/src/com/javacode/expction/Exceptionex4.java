package com.javacode.expction;

public class Exceptionex4 {

	public static void main(String[] args) throws Userdefineexception {
		try {
			// code that generates exception
			int divideByZero = 5 / 0;
		}

		catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		}

		finally {
			System.out.println("This is the finally block");
		}
	}
}
