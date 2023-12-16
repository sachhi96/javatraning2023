package com.javacode.java8;

public class Lamdaex {
	public static void main(String[] args) {
		Hellox h = () -> {
			return "hello";
		};
		System.out.println(h.great());
	}
}
