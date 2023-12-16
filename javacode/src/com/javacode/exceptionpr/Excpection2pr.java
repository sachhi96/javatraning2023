package com.javacode.exceptionpr;

public class Excpection2pr {// using arry
	public static void main(String[] args) {
		try {
			int a[] = { 1, 3, 5, 6, 8, 9 };
			System.out.println(a.length);
			System.out.println(a[7]);
		} catch (ArrayIndexOutOfBoundsException s) {
			System.out.println("please extend limit " + s);
		}

	}
}
