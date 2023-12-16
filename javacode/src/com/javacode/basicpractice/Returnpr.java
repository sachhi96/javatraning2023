package com.javacode.basicpractice;

public class Returnpr {
	public void marvel() {//not pass any return value

	}

	public int ironman() {
		System.out.println("iron suit");
		int a = 24;
		return 0;

	}

	public String hulk() {
		System.out.println("strength");
		String b = "strong";
		return b;

	}

	public static void main(String[] args) {
		Returnpr m = new Returnpr();
		m.marvel();
		m.ironman();
		m.hulk();
	}
}
