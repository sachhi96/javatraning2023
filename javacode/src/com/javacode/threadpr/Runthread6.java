package com.javacode.threadpr;

public class Runthread6 {
	public static void main(String[] args) throws InterruptedException {
		Runthread5 y = new Runthread5();
		Thread r = new Thread(y);
		r.start();
		for(int i=0;i<=10;i++) {
			System.out.println("new therad");
			Thread.sleep(2000);
		}
	}
}
