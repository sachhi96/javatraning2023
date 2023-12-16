package com.javacode.java8pr;

import java.util.Arrays;
import java.util.List;

public class StreamNew {
	public static void main(String[] args) {
		List<Integer> y = Arrays.asList(1, 3, 4, 5, 6);
		int s = y.stream().filter(n -> n % 3 == 1).mapToInt(n -> n).sum();
		System.out.println(s);
	}
}
