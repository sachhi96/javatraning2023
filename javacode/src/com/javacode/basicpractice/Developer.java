package com.javacode.basicpractice;

public class Developer extends Itcompany {
	public void fixing() {
		System.out.println("fixing the bug");
	}

	public static void main(String[] args) {
		Developer d = new Developer();
		d.fixing();
		d.salaryd();
		d.workingtime();
	}
}
