package com.javacode.java8;

public class Lambaex3 {
	public static void main(String[] args) {
		Yard t = (int a) -> {
			return (a * a);
		};
		System.out.println(t.area(2));// output 4
	}
}
