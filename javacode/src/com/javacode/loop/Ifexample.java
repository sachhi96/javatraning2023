package com.javacode.loop;

import java.util.Scanner;

public class Ifexample {
	public static void main(String[] args) {// if and else condn
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("even number " + a);
		} else {
			System.out.println("odd number " + a);
		}
	}
}
