package com.javacode.looppratice;

import java.util.Scanner;

public class Insertelementpr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int length = sc.nextInt();
		int arr[] = new int[length];//using user define so we not pass any value

		System.out.println("Enter the " + length + " element array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]---->" + arr[i]);
		}
	}
}
