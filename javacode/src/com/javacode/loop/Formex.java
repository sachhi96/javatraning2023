package com.javacode.loop;

import java.util.Scanner;

public class Formex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		{
			System.out.println("******** homepage ********");
			System.out.println("enter your name");
			String s = sc.next();
			System.out.println("enter your age");
			int a = sc.nextInt();
			System.out.println("enter your product");
			String p = sc.next();
			System.out.println("******** customer details *********");
			System.out.println("customer name " + s);
			System.out.println("customet age  " + a);
			System.out.println("customer product  " + p);

		}

	}
}
