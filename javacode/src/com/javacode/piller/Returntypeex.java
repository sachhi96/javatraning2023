package com.javacode.piller;

public class Returntypeex {
	public void deposite() {
		System.out.println("i want to depostie");//void will not pass any return value
	}

	public int moneywitdr() {
		System.out.println("back to pocket");
		int a = 10;
		return a;//return type using return keyword

	}

	public String statement() {
		System.out.println("full of mistake");
		String s = "bankstatement";
		int a = 10;// integer not applicable
		return s;

	}

	public static void main(String[] args) {
		Returntypeex r = new Returntypeex();
		r.deposite();
		r.moneywitdr();
		//System.out.println(r.statement());
		r.statement();
	}
}
