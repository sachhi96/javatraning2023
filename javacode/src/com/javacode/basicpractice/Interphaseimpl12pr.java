package com.javacode.basicpractice;

public class Interphaseimpl12pr implements Interphasepr, Interphaseimplpr {
//using implement keyword and interphase we achieve multiple inherit
	@Override
	public void Mcdpizza() {
		System.out.println("okay okay");
		// TODO Auto-generated method stub

	}

	@Override
	public void Mcdburger() {
		System.out.println("average");
		// TODO Auto-generated method stub

	}

	@Override
	public void Mcdjuice() {
		System.out.println("good");
		// TODO Auto-generated method stub

	}

	@Override
	public void dominopizz() {
		System.out.println("nyc");
		// TODO Auto-generated method stub

	}

	@Override
	public void dominburger() {
		System.out.println("gud gud");
		// TODO Auto-generated method stub

	}

	@Override
	public void dominojuice() {
		System.out.println("masala juice");
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Interphaseimpl12pr i = new Interphaseimpl12pr();
		i.dominburger();
		i.dominopizz();
		i.dominojuice();
		i.Mcdburger();
		i.Mcdpizza();
		i.Mcdjuice();
	}
}
