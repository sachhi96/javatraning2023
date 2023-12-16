package com.javacode.basicpractice;

public class Veriable {
	int a = 20;//global

	public void var(int b) {
		System.out.println(a * b);//local
	}

	public static void main(String[] args) {
		Veriable v = new Veriable();
		v.var(3);
	}
}