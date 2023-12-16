package com.javacode.piller;

public class Thisex {//we are using for call current invokeing object or veriable we r using this 2types(this ,this())
	String name;//global veriable
	int age;

	public Thisex(String name, int age) {
		this.name = name;//this keyword
		this.age = age;//local veriable
	}

	public void display() {
		System.out.println("person name " + name + " and age " + age);
	}

	public static void main(String[] args) {
		Thisex t = new Thisex("sachin", 26);
		t.display();
	}
}
