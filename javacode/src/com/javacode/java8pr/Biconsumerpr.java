package com.javacode.java8pr;

import java.util.function.BiConsumer;

public class Biconsumerpr {
	public static void main(String[] args) {
		BiConsumer<String, Integer> p = (String s, Integer t) -> {
			System.out.println(s + "  " + t);
		};
		p.accept("hero", 0);
	}
}
