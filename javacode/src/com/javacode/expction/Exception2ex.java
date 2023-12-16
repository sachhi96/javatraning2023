package com.javacode.expction;

public class Exception2ex {
	public static void main(String[] args) throws Userdefineexpectionnew {
		int num[] = { 1, 2, 3, 4, 4 };
		try {

			System.out.println(num[9]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("not accept" + e);
		}
		System.out.println(num[1]);
	}
}
