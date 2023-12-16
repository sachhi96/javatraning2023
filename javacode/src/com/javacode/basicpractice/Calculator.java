package com.javacode.basicpractice;

import java.util.Scanner;

public class Calculator {
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void sub(int a, int b) {
		System.out.println(a - b);
	}

	public void div(int a, int b) {
		System.out.println(a / b);
	}

	public void mul(int a, int b) {
		System.out.println(a * b);
	}

	public static void main(String[] args) {
		Scanner se = new Scanner(System.in);// user define only we use scanner
		System.out.println("enter value");
		int a=se.nextInt();//?
		int b=se.nextInt();
		Calculator C = new Calculator();
		C.add(a , b);
		C.sub(a , b);
		C.div(a , b);
		C.mul(a , b);
	}
}