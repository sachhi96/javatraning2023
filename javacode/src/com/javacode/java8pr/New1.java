package com.javacode.java8pr;

public class New1 {
	public static void main(String[] args) {
		New u = (int a, int b) -> {
			return a + b;
		};
		System.out.println(u.add(3, 4));
	}
}
