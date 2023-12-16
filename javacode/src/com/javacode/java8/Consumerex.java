package com.javacode.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumerex {
	public static void main(String[] args) {// ex
		Consumer<String> c = (String s) -> {
			System.out.println(s); // no return value
		};
		c.accept("hello");

		// ex2
		List<String> n = Arrays.asList("sachin", "maruti", "ankita");
		Consumer<String> b = (String s) -> {
			System.out.println(s);

		};
		n.forEach(b);
	}
}
