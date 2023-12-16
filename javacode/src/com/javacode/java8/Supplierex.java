package com.javacode.java8;

import java.util.function.Supplier;

public class Supplierex {
	public static void main(String[] args) {

		Supplier<String> messageSupplier = () -> "Supplier java code";//just pass the msg and get msg

		String message = messageSupplier.get();
		System.out.println(message);
	}

}
