package com.javacode.threadpr;

public class Runthread2 {
	public static void main(String[] args) {
		Runthread1 r = new Runthread1();
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("Nahi bhaga Mikha");
		}
	}

}
