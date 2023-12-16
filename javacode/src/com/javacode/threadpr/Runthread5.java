package com.javacode.threadpr;

public class Runthread5 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<=10;i++) {
			System.out.println("Budhwar");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
