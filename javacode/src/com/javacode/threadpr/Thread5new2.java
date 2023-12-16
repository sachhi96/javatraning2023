package com.javacode.threadpr;

public class Thread5new2 {
	public static void main(String[] args) throws InterruptedException {
		Thread5new t = new Thread5new();
		t.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("why super");
			Thread.sleep(2000);
		}
	}
}
