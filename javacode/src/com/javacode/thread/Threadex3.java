package com.javacode.thread;

public class Threadex3 {
	public static void main(String[] args) throws InterruptedException {
		Threadex01 t = new Threadex01();
		t.start();
		for (int i = 0; i <= 5; i++)
			System.out.println("super class");
		Thread.sleep(2000);
	}
}
