package com.javacode.looppratice;

public class Thiskeypr {
	String name;
	int age;

	public Thiskeypr(String name, int age) {
	this.name=name;
	this.age=age;
	}

	public void mainsteet() {
		System.out.println("studentname " + name + "  and age " + age);
	}

	public static void main(String[] args) {
		Thiskeypr t = new Thiskeypr("Sachin", 26);
		t.mainsteet();
		
	}
}
