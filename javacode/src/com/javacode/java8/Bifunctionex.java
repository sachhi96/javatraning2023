package com.javacode.java8;

import java.util.function.BiFunction;

public class Bifunctionex {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
//BiFunction(parameter,parameter,return type)
		int result = sum.apply(2, 3);
		System.out.println(result); // Output: 5
	}
}
