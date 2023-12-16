package com.javacode.collection;

import java.util.ArrayList;

public class Arrylistex3 {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Geeks");// duplicate
		al.add("Geeks");

		al.add(1, "Go");
		System.out.println("Initial ArrayList " + al);// in index order
		al.set(0, "noo");// set is use for updated
		System.out.println("Updated ArrayList " + al);

	}
}
