package com.javacode.java8pr;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumerex {
	public static void main(String[] args) {
		Consumer<String> f = (String s) -> {
			System.out.println(s);
		};
		f.accept("jai");

		List<String> d = Arrays.asList("hai", "by");
		Consumer<String> v = (String s) -> {
			System.out.println(d);
		};
		d.forEach(v);
	}
}
