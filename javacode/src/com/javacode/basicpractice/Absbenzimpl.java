package com.javacode.basicpractice;

public class Absbenzimpl extends Abstractbenz {

	@Override
	public void fuel() {
		System.out.println("Fuel Type = Diesel");
		// TODO Auto-generated method stub

	}

	@Override
	public void updateversion() {
		System.out.println("Merceds-Benz GLC (65 lakh*");
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Absbenzimpl a = new Absbenzimpl();
		a.fuel();
		a.updateversion();
	}
}
