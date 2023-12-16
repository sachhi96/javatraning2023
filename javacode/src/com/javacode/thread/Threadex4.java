package com.javacode.thread;

public class Threadex4 extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++)
			System.out.println("super class");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
