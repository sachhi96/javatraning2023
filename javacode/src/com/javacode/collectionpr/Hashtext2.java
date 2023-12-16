package com.javacode.collectionpr;

import java.util.HashSet;

public class Hashtext2 {
public static void main(String[] args) {
	HashSet<String> fruits = new HashSet<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");
    fruits.add("Chiku");

    boolean containsBanana = fruits.contains("Banana");//contain predefined method
    boolean containsMango = fruits.contains("Mango");

    System.out.println(containsBanana);  // Output: true
    System.out.println(containsMango);   // Output: false
    System.out.println(fruits);
}
}
