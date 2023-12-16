package com.javacode.collectionpr;

import java.util.ArrayList;

public class Arrylistindexpr {
	public static void main(String[] args) {
		ArrayList<String> v = new ArrayList<String>();
		v.add("iphone12");
		v.add("iphone14");
		v.add("iphone13");
		v.add("iphone15");

		v.add(1, "iphone13");
		System.out.println("updated version " +v);
		v.set(0, "iphone");//using set(int index ,string element)arrylist
		{
			System.out.println("iphone version " +v);
		}
	}
}
