package com.javacode.basic;

import java.util.Scanner;

public class calculator {
	public void add(int a, int b) {
		System.out.println(a + b);

	}

	public void sub(int a, int b) {
		System.out.println(a - b);

	}

	public void mul(int a, int b) {
		System.out.println(a * b);

	}

	public void div(int a, int b) {
		System.out.println(a / b);

	}
public static void main(String[] args) {
	Scanner se = new Scanner(System.in);//user reference
	System.out.println("enter two values");
	int a = se.nextInt();
	int b = se.nextInt();
	calculator c=new calculator();//object reference we can class
	c. add(4, 10);
	c.sub(5, 7);
	c.div(4, 2);
	c.mul(5, 0);
}
}
