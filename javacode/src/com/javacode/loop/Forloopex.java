package com.javacode.loop;

import java.util.Scanner;

public class Forloopex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// user reference
		System.out.println("enter the value");// for loop using
		int a = sc.nextInt();// only int datatype?
		/*
		 * for (int i = 0; i <= a; i++) /// syntax :
		 * for(intilazation;condition,decrement/increment) {
		 * System.out.println("hello world"); }
		 */
		for (int i = 0; i <= a; i++) {
			System.out.println("worldcup");
		}
	}
}
