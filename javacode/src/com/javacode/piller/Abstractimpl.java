package com.javacode.piller;

public class Abstractimpl extends Abstractex {// method over riding

	@Override
	public void data() {
		System.out.println("prize"); // TODO Auto-generated method stub

	}

	@Override
	public void feature() {
		System.out.println("colour"); // TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Abstractimpl a = new Abstractimpl();
		a.feature();
		a.data();
	}
}
