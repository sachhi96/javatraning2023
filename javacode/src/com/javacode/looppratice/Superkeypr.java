package com.javacode.looppratice;

class Movie {
	void action() {
		System.out.println("action");
	}
}

class War extends Movie {
	void action() {
		System.out.println("ful action");
	}

	void emotion() {
		System.out.println("family sentiment");
	}

	void play() {
		super.action();
		emotion();
	}
}

public class Superkeypr {

	public static void main(String[] args) {
		War w = new War();
		w.play();
	}
}
