package com.javacode.exceptionpr;

public class ExceptionPr {

	public static void main(String[] args) throws UserException {

		try {
			// code that generates exception
			int divideByZero = 25 / 0;
			System.out.println(divideByZero);
		}

		catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		}

	}
}
