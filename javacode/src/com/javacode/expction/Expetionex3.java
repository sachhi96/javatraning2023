package com.javacode.expction;

public class Expetionex3 {
	public static void main(String[] args) {
		try {
			String nam[] = { "sachin", "Virat", "dhoni", "warner" };

			System.out.println(nam[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("limit chaeck" + e);
			
		} catch (ArithmeticException e)
		{
			System.out.println("limit check" + e);
		}

	}
}
