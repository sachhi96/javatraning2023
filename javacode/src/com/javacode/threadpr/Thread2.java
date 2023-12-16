package com.javacode.threadpr;

public class Thread2 {
	public static void main(String[] args) throws InterruptedException {
		Thread1 t = new Thread1();
		t.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("Super");
			Thread.sleep(2000);
		}
	}
}
