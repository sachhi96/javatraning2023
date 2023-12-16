package com.javacode.basic;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Simple Calculator");
		System.out.println("Enter two numbers:");

		// Input the two numbers
		System.out.print("Number 1: ");
		double num1 = scanner.nextDouble();

		System.out.print("Number 2: ");
		double num2 = scanner.nextDouble();

		// Perform calculations
		double sum = num1 + num2;
		double difference = num1 - num2;
		double product = num1 * num2;
		double quotient = num1 / num2;

		// Display the results
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		System.out.println("Quotient: " + quotient);

		scanner.close();
	}
}
