package com.javacode.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Bycosumerex {
	public static void main(String[] args) {
		BiConsumer<String, String> v = (String s, String p) -> {
			System.out.println(s + " " + p);
		};
		v.accept("hello", "world");
		// ex2

		Map<String, Integer> map = new HashMap<>();
		BiConsumer<String, Integer> i = (String s, Integer p) -> {
			map.put(s, p);
		};
		i.accept("Jai", 6);
		i.accept("why", 9);
		System.out.println(map);
	}
}
