package com.javacode.collectionpr;

import java.util.HashSet;

public class Hashtextex {
	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();// unique value,hashtable key and value player
		cars.add("Volvo");
		cars.add("BMW");// override
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Mazda");
		System.out.println(cars);
	}
}
