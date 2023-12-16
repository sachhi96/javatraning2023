package com.javacode.java8;

import java.util.function.BiPredicate;

public class Biprdicateex {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> isSumEven = (a, b) -> (a + b) % 2 == 0;

		System.out.println(isSumEven.test(2, 3)); // Output: false//two argument passed
		System.out.println(isSumEven.test(4, 5)); // Output: false
		System.out.println(isSumEven.test(4, 4)); // Output: true
	}
}
