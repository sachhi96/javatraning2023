package com.javacode.java8pr;

import java.util.function.Supplier;

public class Supply {
	public static void main(String[] args) {
		Supplier<String> s = () -> "Nice";
		String y = s.get();
		System.out.println(y);
	}
}
