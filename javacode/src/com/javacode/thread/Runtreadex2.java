package com.javacode.thread;

public class Runtreadex2 {
	public static void main(String[] args) {
		Runtreadex r = new Runtreadex();
		Thread t = new Thread(r);//?
		t.start();
		for (int i = 0; i <= 5; i++)
			System.out.println("run class");

	}
}
