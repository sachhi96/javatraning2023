package com.javacode.loop;

public class Arrayex {
	public static void main(String[] args) {
		int a[] = { 20, 40, 60, 80, 100, 120 };// inst the array
		int a1[] = new int[5];// dec array
		a1[0] = 30;// java index start with zero
		a1[1] = 40;
		a1[2] = 50;
		a1[3] = 60;
		a1[4] = 70;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		System.out.println(a.length);
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);

		}
		System.out.println(a1.length);

	}

}
