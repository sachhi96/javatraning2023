package com.javacode.java8;

import java.util.function.Function;

public class Funcationex {
	public static void main(String[] args) {
        Function<Integer, String> intToString = number -> "The number is: " + number;
        //Function(Parameter,Return Type)
        String result = intToString.apply(42);
        System.out.println(result);  
    }
}
