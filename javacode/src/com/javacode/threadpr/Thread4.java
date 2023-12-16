package com.javacode.threadpr;

public class Thread4 {
	public static void main(String[] args) throws InterruptedException {
		Thread3 t = new Thread3();
		t.start();
		for (int i = 0; i <= 23; i++) {
			System.out.println("India will be win");
			Thread.sleep(2000);
		}
	}
}
