package com.javacode.java8;

import java.util.Arrays;

import java.util.List;

public class Streamex {
	public static void main(String[] args) {
		List<Integer> h = Arrays.asList(1, 2, 3, 4, 5, 10, 40);
		int s = h.stream().filter(n -> n % 2 == 1).mapToInt(n -> n).sum();//perform various operation
		System.out.println(s);
	}
}
