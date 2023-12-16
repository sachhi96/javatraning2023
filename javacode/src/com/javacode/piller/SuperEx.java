package com.javacode.piller;

class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("eating bread...");
	}

	void bark() {
		System.out.println("barking...");
	}

	void work() {
		super.eat();// to call super class into the subclass we use "super keyword"
		bark();
	}
}

public class SuperEx {
	public static void main(String args[]) {
		Dog d = new Dog();
		d.work();
	}
}
