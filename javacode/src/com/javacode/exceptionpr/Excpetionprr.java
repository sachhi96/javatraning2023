package com.javacode.exceptionpr;

public class Excpetionprr {// exception class name not be same as exception keyword
	public static void main(String[] args) throws UserDefine01 {
		try {
			int a = 3 / 0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println("not possibale " + e);
		}

		finally {
			System.out.println("okay");// it will pass own massage
		}

	}
}
