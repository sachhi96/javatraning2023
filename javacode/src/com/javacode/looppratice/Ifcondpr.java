package com.javacode.looppratice;

import java.util.Scanner;

public class Ifcondpr {
	public static void main(String[] args) {
		Scanner se = new Scanner(System.in);
		System.out.println("Item name = ");

		String s = se.next();
		if (s.equals("ice")) {
			System.out.println("cold");
		} else if (s == "beer") {
			System.out.println("cold");
		} else if (s == "juice") {
			System.out.println("cold");
		} else if (s == "milk") {
			System.out.println("hot");
		} else {
			System.out.println("invalid input");
		}
	}

}