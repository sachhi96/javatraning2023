package com.javacode.collection;

import java.util.HashSet;

public class Hashtextpr {
	public static void main(String[] args) {
		HashSet<String> gold = new HashSet<String>();
		gold.add("Ring");
		gold.add("neckless");
		gold.add("Earing");
		gold.add("Ring");
		System.out.println(gold);

		boolean containsbelt = gold.contains("belt");
		boolean containsRing = gold.contains("Ring");

		System.out.println(containsbelt);
		System.out.println(containsRing);
	}
}
