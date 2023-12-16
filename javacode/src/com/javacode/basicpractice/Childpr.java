package com.javacode.basicpractice;

public class Childpr extends Parentpr {
	public void customer() {
		System.out.println("buy");
	}

	public static void main(String[] args) {
		Childpr c = new Childpr();
		c.demartt();
		c.demart();
		c.demart1();
		c.customer();
		c.purchase();//parent and child (singel level)
		              //grand parent and parent and clild (multi level ) 
	}
}
