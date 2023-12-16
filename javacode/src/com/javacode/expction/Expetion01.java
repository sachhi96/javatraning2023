package com.javacode.expction;

public class Expetion01 {
	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5 };
		try {// particular line

			num[6] = 50;//50/0 Arithmetic exception

			System.out.println(num);
		} catch (ArithmeticException e) {
			System.out.println("you cannot divied by zero");
		}

		catch (ArrayIndexOutOfBoundsException e) {// IF Arithmetic exception is correct it will take another exception
			System.out.println("cont div by 0");// for one try we can use double catch block
		}
	}
}
