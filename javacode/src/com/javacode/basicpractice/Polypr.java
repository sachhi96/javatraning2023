package com.javacode.basicpractice;

public class Polypr {
	public void kfc() {
		System.out.println();
	}
	public void kfc(char a) {
		System.out.println("chickne lollypop");//achiev compile time error with method over loading
	}
	public void kfc(char a,char b) {
		System.out.println( "veg burger ");
	
	}
	public static void main(String[] args) {
		 Polypr p=new Polypr();
		 p.kfc();
		 p.kfc('a');
		 p.kfc('a', 'b');
	}
	
}
