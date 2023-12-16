package com.javacode.java8;

import java.util.function.Predicate;

public class Predicateex {
	public static void main(String[] args) {
		Predicate<Integer> isEven = number -> number % 2 == 0;

		System.out.println(isEven.test(4)); // Output: true
		System.out.println(isEven.test(7)); // Output: false
		System.out.println(isEven.test(8));//
		System.out.println(isEven.test(5));
	}
}
