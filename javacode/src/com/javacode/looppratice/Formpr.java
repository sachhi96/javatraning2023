package com.javacode.looppratice;

import java.util.Scanner;

public class Formpr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		{
			System.out.println("*****homepage*****");
			System.out.println("enter your name");
			String n = sc.next();
			System.out.println("enter age");
			int a = sc.nextInt();
			System.out.println("enter your grade");
			char g = sc.next().charAt(0);// remember
			System.out.println("******* the form*******");
			System.out.println("customer name   " + n);
			System.out.println("customer age    " + a);
			System.out.println("customer grade  " + g);
		}
	}
}
