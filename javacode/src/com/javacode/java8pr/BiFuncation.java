package com.javacode.java8pr;

import java.util.function.BiFunction;

public class BiFuncation {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> y = (a, b) -> (a * b);
		int total = y.apply(4, 6);
		System.out.println(total);
	}
}
