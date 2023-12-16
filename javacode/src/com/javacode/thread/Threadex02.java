package com.javacode.thread;

public class Threadex02 {
	public static void main(String[] args) {
		Threadex01 t = new Threadex01();
		t.start();
		for (int i = 0; i <= 5; i++)
			System.out.println("super class");
	}
}
