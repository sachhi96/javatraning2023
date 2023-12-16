package com.javacode.looppratice;

public class Constuctorepr {
	public Constuctorepr() {
		System.out.println("defult value");//void return type not using
	}

	public Constuctorepr(int a) {
		System.out.println("only");
	}

	public Constuctorepr(int a, int b) {
		System.out.println("two value");
	}

	public static void main(String[] args) {
		Constuctorepr c = new Constuctorepr();
		Constuctorepr a = new Constuctorepr(4);
		Constuctorepr b = new Constuctorepr(4,6);

	}
}
