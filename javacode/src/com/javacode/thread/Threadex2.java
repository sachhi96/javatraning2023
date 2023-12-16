package com.javacode.thread;

public class Threadex2 {
public static void main(String[] args) throws InterruptedException {
	Threadex t=new Threadex();
	t.start();
	for (int i = 0; i <= 5; i++)
		System.out.println("super class");
	Thread.sleep(2000);
	
}
}
