package com.javacode.java8pr;

import java.util.function.Function;

public class Functionpr {
	public static void main(String[] args) {
		Function<Integer, String> intToString = number -> "The number is: " + number;
		String g = intToString.apply(44);
		System.out.println(g);
	}
}
