package com.javacode.java8;

public class Lamdaex2 {
	public static void main(String[] args) {
		Calculator h = (int a,int b)-> {
			return (a+b);
		};
		System.out.println(h.sum(3, 4));
	}
}
